package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_dst2_3_0_Test {

    private GridPoint2Mutant point1, point2, point3;

    @BeforeEach
    void setUp() {
        point1 = new GridPoint2Mutant(0, 0);
        point2 = new GridPoint2Mutant(5, 7);
        point3 = new GridPoint2Mutant(-3, -4);
    }

    @Test
    void testDst2() {
        // distance^2 to (5, 7) is 50
        Assertions.assertEquals(50, point1.dst2(5, 7));
        // distance^2 to (-3, -4) is 130
        Assertions.assertEquals(130, point1.dst2(-3, -4));
    }

    @Test
    void testDst() {
        // distance to (5, 7) is sqrt(50)
        Assertions.assertEquals(Math.sqrt(50), point1.dst(5, 7));
        // distance to (-3, -4) is sqrt(130)
        Assertions.assertEquals(Math.sqrt(130), point1.dst(-3, -4));
    }

    @Test
    void testDstWithPoint() {
        point2.set(-3, -4);
        // distance to (-3, -4) is sqrt(50)
        Assertions.assertEquals(Math.sqrt(50), point1.dst(point2));
    }

    @Test
    void testSetWithPoint() {
        GridPoint2Mutant temp = new GridPoint2Mutant();
        temp.set(5, 7);
        Assertions.assertEquals(5, point1.x);
        Assertions.assertEquals(7, point1.y);
        point1.set(temp);
        Assertions.assertEquals(5, point1.x);
        Assertions.assertEquals(7, point1.y);
    }

    @Test
    void testSetWithInts() {
        point2.set(-3, -4);
        Assertions.assertEquals(-3, point1.x);
        Assertions.assertEquals(-4, point1.y);
        point1.set(5, 7);
        Assertions.assertEquals(5, point1.x);
        Assertions.assertEquals(7, point1.y);
    }

    @Test
    void testAddWithPoint() {
        GridPoint2Mutant temp = new GridPoint2Mutant();
        temp.set(-3, -4);
        point1.add(temp);
        Assertions.assertEquals(2, point1.x);
        Assertions.assertEquals(3, point1.y);
        point1.add(5, 7);
        Assertions.assertEquals(7, point1.x);
        Assertions.assertEquals(10, point1.y);
    }

    @Test
    void testAddWithInts() {
        point2.add(-3, -4);
        Assertions.assertEquals(2, point1.x);
        Assertions.assertEquals(3, point1.y);
        point1.add(5, 7);
        Assertions.assertEquals(7, point1.x);
        Assertions.assertEquals(10, point1.y);
    }

    @Test
    void testSubWithPoint() {
        GridPoint2Mutant temp = new GridPoint2Mutant();
        temp.set(-3, -4);
        point1.sub(temp);
        Assertions.assertEquals(8, point1.x);
        Assertions.assertEquals(11, point1.y);
        point1.sub(5, 7);
        Assertions.assertEquals(3, point1.x);
        Assertions.assertEquals(4, point1.y);
    }

    @Test
    void testSubWithInts() {
        point2.sub(-3, -4);
        Assertions.assertEquals(8, point1.x);
        Assertions.assertEquals(11, point1.y);
        point1.sub(5, 7);
        Assertions.assertEquals(3, point1.x);
        Assertions.assertEquals(4, point1.y);
    }
}
