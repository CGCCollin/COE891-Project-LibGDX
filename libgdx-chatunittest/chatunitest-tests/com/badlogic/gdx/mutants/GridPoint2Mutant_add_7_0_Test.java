package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_add_7_0_Test {

    private GridPoint2Mutant point1, point2;

    @BeforeEach
    void setUp() {
        point1 = new GridPoint2Mutant(3, 5);
        point2 = new GridPoint2Mutant(7, 9);
    }

    @Test
    void testAdd() throws Exception {
        GridPoint2Mutant result = point1.add(point2);
        assertEquals(10, result.x);
        assertEquals(14, result.y);
        result = point1.add(7, 9);
        assertEquals(10, result.x);
        assertEquals(14, result.y);
    }

    @Test
    void testAddIntInt() throws Exception {
        GridPoint2Mutant result = point1.add(8, 12);
        assertEquals(11, result.x);
        assertEquals(17, result.y);
    }

    @Test
    void testSet() throws Exception {
        point1.set(3, 5);
        assertEquals(3, point1.x);
        assertEquals(5, point1.y);
        point1.set(point2);
        assertEquals(7, point1.x);
        assertEquals(9, point1.y);
    }

    @Test
    void testSetGridPoint2Mutant() throws Exception {
        point1.set(new GridPoint2Mutant(3, 5));
        assertEquals(3, point1.x);
        assertEquals(5, point1.y);
    }

    @Test
    void testCpy() throws Exception {
        GridPoint2Mutant copy = point1.cpy();
        assertNotSame(point1, copy);
        assertEquals(point1.x, copy.x);
        assertEquals(point1.y, copy.y);
    }

    @Test
    void testEquals() throws Exception {
        assertTrue(point1.equals(new GridPoint2Mutant(3, 5)));
        assertFalse(point1.equals(new GridPoint2Mutant(7, 9)));
        assertFalse(point1.equals(null));
    }

    @Test
    void testHashCode() throws Exception {
        assertEquals(Integer.hashCode(3) ^ Integer.hashCode(5), point1.hashCode());
    }

    @Test
    void testToString() throws Exception {
        assertEquals("GridPoint2Mutant [x=3, y=5]", point1.toString());
    }
}
