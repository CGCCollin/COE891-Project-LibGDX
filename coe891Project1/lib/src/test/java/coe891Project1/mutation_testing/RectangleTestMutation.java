/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import coe891Project1.mutants.RectangleMutant;

     

/**
 *
 * @author matthewhvizdos
 */
public class RectangleTestMutation {
    // Testing set 
    
    @Test
    public void setValuesTest() {
        RectangleMutant rect = new RectangleMutant();
        rect.set(1, 2, 3, 4);

        assertEquals(1f, rect.x, 0.0001);
        assertEquals(2f, rect.y, 0.0001);
        assertEquals(3f, rect.width, 0.0001);
        assertEquals(4f, rect.height, 0.0001);
    }
    
    @Test
    public void setOverwriteTest() {
        RectangleMutant rect = new RectangleMutant(5, 5, 5, 5);

        rect.set(2, 3, 4, 6);

        assertEquals(2f, rect.x, 0.0001);
        assertEquals(3f, rect.y, 0.0001);
        assertEquals(4f, rect.width, 0.0001);
        assertEquals(6f, rect.height, 0.0001);
    }
    
    @Test
    public void setChainingTest() {
        RectangleMutant rect = new RectangleMutant();

        RectangleMutant result = rect.set(1,1,2,2);

        assertSame(rect, result);
    }
    
    
    
    
    
    
    // testing contains
    
    @Test
    public void containsPointInsideTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertTrue(rect.contains(5,5));
    }
    
    @Test
    public void containsPointOutsideRightTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertFalse(rect.contains(11,5));
    }
    
    @Test
    public void containsPointOutsideLeftTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertFalse(rect.contains(-1,5));
    }
    
    @Test
    public void containsPointAboveTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertFalse(rect.contains(5,11));
    }
    
    @Test
    public void containsPointBelowTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertFalse(rect.contains(5,-1));
    }
 
    @Test
    public void containsPointOnBoundaryTest() {
        RectangleMutant rect = new RectangleMutant(0,0,10,10);

        assertTrue(rect.contains(0,0));
        assertTrue(rect.contains(10,10));
    }
    
    @Test
    public void containsCornerTest() {
        RectangleMutant rect = new RectangleMutant(2,3,4,5);

        assertTrue(rect.contains(2,3));
    }
    
    @Test
    public void containsOppositeCornerTest() {
        RectangleMutant rect = new RectangleMutant(2,3,4,5);

        assertTrue(rect.contains(6,8));
    }
    
}
