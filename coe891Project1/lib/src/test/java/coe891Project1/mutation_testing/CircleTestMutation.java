/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.badlogic.gdx.math.Circle;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test cases to run mutation tests with
 * @author matthewhvizdos
 */
public class CircleTestMutation {
    
    private Circle circle = null;
    private Circle other = null;
    
    @BeforeEach
    public void before() {
        circle = null;
        other = null;
    }
    
    
    /* Testing the contains(Circle c) function */
    
    @Test
    public void fullOverlapTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(1, 1, 1);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void partialOverlapTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(10, 10, 10);
        assertFalse(circle.contains(other));
    }
    
    @Test
    public void touchingBoundaryTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(5, 0, 5);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void veryCloseToBoundaryTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(4.999f, 0, 5);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void sameCircleTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(0, 0, 10);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void largerCircleInsideSmallerTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(0, 0, 20);
        assertFalse(circle.contains(other));
    }
    
    @Test
    public void completelySeparateCirclesTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(100, 100, 10);
        assertFalse(circle.contains(other));
    }
    
    /* Testing the overlaps(Circle c) function*/
    
    @Test
    public void secondPartialOverlapTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(10, 10, 10);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void secondTouchingBoundaryTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(5, 0, 5);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void secondCompletelySeparateCirclesTest() {
        circle = new Circle(0, 10, 10);
        other  = new Circle(100, 100, 10);
        assertFalse(circle.overlaps(other));
    }
    
    @Test
    public void secondFullOverlapTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(1, 1, 1);
        assertTrue(circle.overlaps(other));
    }
   
    @Test
    public void secondSameCircleTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(0, 0, 10);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void smallCircleInsideLargerTest() {
        circle = new Circle(0, 0, 10);
        other  = new Circle(0, 0, 1);
        assertTrue(circle.overlaps(other));
    }
    
}
