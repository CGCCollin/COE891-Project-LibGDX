package com.badlogic.gdx.mutants;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

class GridPoint2Mutant_dst_4_0_Test {

    @Test
    void testDst() throws Exception {
        // Create two GridPoint2Mutant objects
        GridPoint2Mutant point1 = new GridPoint2Mutant(0, 0);
        GridPoint2Mutant point2 = new GridPoint2Mutant(3, 4);
        // Calculate the distance between the two points using reflection
        Method dstMethod = GridPoint2Mutant.class.getDeclaredMethod("dst", GridPoint2Mutant.class);
        float distance = (float) dstMethod.invoke(point1, point2);
        // Check that the distance is calculated correctly
        assertEquals(5.0f, distance, 0.001);
    }
}
