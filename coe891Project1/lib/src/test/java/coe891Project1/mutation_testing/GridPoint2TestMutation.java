/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.badlogic.gdx.math.GridPoint2;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test cases to run mutation tests with
 * @author matthewhvizdos
 */
public class GridPoint2TestMutation {
    private GridPoint2 point = null;
    private GridPoint2 other = null;
            
    @BeforeEach
    public void before() {
        point = null;
        other = null;
    }
    
    /* Testing the dst2(GridPoint2 other) function */
    
    @Test
    public void samePointTest() {
        point = new GridPoint2(0, 0);
        other = new GridPoint2(0, 0);
        assertEquals(0f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void horizontalDistanceTest() {
        point = new GridPoint2(0, 0);
        other = new GridPoint2(5, 0);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void verticalDistanceTest() {
        point = new GridPoint2(0, 0);
        other = new GridPoint2(0, 5);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void diagonalDistanceTest() {
        point = new GridPoint2(0, 0);
        other = new GridPoint2(3, 4);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void negativeCoordinatesTest() {
        point = new GridPoint2(-3, -4);
        other = new GridPoint2(0, 0);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void symmetryTest() {
        point = new GridPoint2(1, 2);
        other = new GridPoint2(3, 4);
        assertEquals(point.dst2(other), other.dst2(point), 0.0001);
    }
    
}
