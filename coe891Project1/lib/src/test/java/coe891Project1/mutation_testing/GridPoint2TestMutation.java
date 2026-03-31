/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import coe891Project1.mutants.GridPoint2Mutant;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test cases to run mutation tests with
 * @author matthewhvizdos
 */
public class GridPoint2TestMutation {
    private GridPoint2Mutant point = null;
    private GridPoint2Mutant other = null;
            
    @BeforeEach
    public void before() {
        point = null;
        other = null;
    }
    
    /* Testing the dst2(GridPoint2 other) function */
    
    @Test
    public void samePointTest() {
        point = new GridPoint2Mutant(0, 0);
        other = new GridPoint2Mutant(0, 0);
        assertEquals(0f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void horizontalDistanceTest() {
        point = new GridPoint2Mutant(0, 0);
        other = new GridPoint2Mutant(5, 0);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void verticalDistanceTest() {
        point = new GridPoint2Mutant(0, 0);
        other = new GridPoint2Mutant(0, 5);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void diagonalDistanceTest() {
        point = new GridPoint2Mutant(0, 0);
        other = new GridPoint2Mutant(3, 4);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void negativeCoordinatesTest() {
        point = new GridPoint2Mutant(-3, -4);
        other = new GridPoint2Mutant(0, 0);
        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void symmetryTest() {
        point = new GridPoint2Mutant(1, 2);
        other = new GridPoint2Mutant(3, 4);
        assertEquals(point.dst2(other), other.dst2(point), 0.0001);
    }
    
    @Test
    public void mixedCoordinateDistanceTest() {
        point = new GridPoint2Mutant(5, -3);
        other = new GridPoint2Mutant(-1, 2);

        assertEquals(61f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void largeCoordinatesTest() {
        point = new GridPoint2Mutant(100, 200);
        other = new GridPoint2Mutant(103, 204);

        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void sameXCoordinateTest() {
        point = new GridPoint2Mutant(3, 7);
        other = new GridPoint2Mutant(3, 10);

        assertEquals(9f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void sameYCoordinateTest() {
        point = new GridPoint2Mutant(4, 5);
        other = new GridPoint2Mutant(9, 5);

        assertEquals(25f, point.dst2(other), 0.0001);
    }
    
    @Test
    public void unevenDiagonalTest() {
        point = new GridPoint2Mutant(1, 1);
        other = new GridPoint2Mutant(4, 6);

        assertEquals(34f, point.dst2(other), 0.0001);
    }
    
    // testing add func
    
    @Test
    public void addPositivePoints() {
        point = new GridPoint2Mutant(2,3);
        other = new GridPoint2Mutant(4,5);

        point.add(other);

        assertEquals(6, point.x);
        assertEquals(8, point.y);
    }

    @Test
    public void addNegativeValues() {
        point = new GridPoint2Mutant(5,5);
        other = new GridPoint2Mutant(-2,-3);

        point.add(other);

        assertEquals(3, point.x);
        assertEquals(2, point.y);
    }

    @Test
    public void addZeroPoint() {
        point = new GridPoint2Mutant(7,9);
        other = new GridPoint2Mutant(0,0);

        point.add(other);

        assertEquals(7, point.x);
        assertEquals(9, point.y);
    }

    @Test
    public void addReturnsSameObjectForChaining() {
        point = new GridPoint2Mutant(1,1);
        other = new GridPoint2Mutant(2,2);

        GridPoint2Mutant result = point.add(other);

        assertSame(point, result);
    }

    @Test
    public void addDoesNotModifyOtherPoint() {
        point = new GridPoint2Mutant(3,4);
        other = new GridPoint2Mutant(1,2);

        point.add(other);

        assertEquals(1, other.x);
        assertEquals(2, other.y);
    }
    
}
