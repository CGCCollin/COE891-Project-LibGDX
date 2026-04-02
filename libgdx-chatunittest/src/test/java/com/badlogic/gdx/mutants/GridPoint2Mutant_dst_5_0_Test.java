package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

class GridPoint2Mutant_dst_5_0_Test {

    @Test
    void testDst() throws Exception {
        // Arrange
        GridPoint2Mutant point1 = new GridPoint2Mutant(0, 0);
        GridPoint2Mutant point2 = new GridPoint2Mutant(3, 4);
        // Act
        // expected result is sqrt(5)
        float distance = (float) Math.sqrt(5);
        float actualDistance = point1.dst(point2.x, point2.y);
        // Assert
        assertEquals(distance, actualDistance, 0.0001);
    }
}
