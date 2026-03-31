/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import coe891Project1.mutants.CircleMutant;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test cases to run mutation tests with
 * @author matthewhvizdos
 */
public class CircleTestMutation {
    
    private CircleMutant circle = null;
    private CircleMutant other = null;
    
    @BeforeEach
    public void before() {
        circle = null;
        other = null;
    }
    
    
    /* Testing the contains(Circle c) function */
    
    @Test
    public void fullOverlapTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(1, 1, 1);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void partialOverlapTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(10, 10, 10);
        assertFalse(circle.contains(other));
    }
    
    @Test
    public void touchingBoundaryTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(5, 0, 5);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void veryCloseToBoundaryTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(4.999f, 0, 5);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void sameCircleTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(0, 0, 10);
        assertTrue(circle.contains(other));
    }
    
    @Test
    public void largerCircleInsideSmallerTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(0, 0, 20);
        assertFalse(circle.contains(other));
    }
    
    @Test
    public void completelySeparateCirclesTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(100, 100, 10);
        assertFalse(circle.contains(other));
    }
    
    /* Testing the overlaps(Circle c) function*/
    
    @Test
    public void secondPartialOverlapTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(10, 10, 10);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void secondTouchingBoundaryTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(5, 0, 5);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void secondCompletelySeparateCirclesTest() {
        circle = new CircleMutant(0, 10, 10);
        other  = new CircleMutant(100, 100, 10);
        assertFalse(circle.overlaps(other));
    }
    
    @Test
    public void secondFullOverlapTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(1, 1, 1);
        assertTrue(circle.overlaps(other));
    }
   
    @Test
    public void secondSameCircleTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(0, 0, 10);
        assertTrue(circle.overlaps(other));
    }
    
    @Test
    public void smallCircleInsideLargerTest() {
        circle = new CircleMutant(0, 0, 10);
        other  = new CircleMutant(0, 0, 1);
        assertTrue(circle.overlaps(other));
    }
    
}
