package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.GridPoint2Mutant;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

class GridPoint2Mutant_dst2_2_1_Test {

    @DisplayName("dst2 method")
    @Test
    void testDst2() throws Exception {
        // Arrange
        GridPoint2Mutant point1 = new GridPoint2Mutant(0, 0);
        GridPoint2Mutant point2 = new GridPoint2Mutant(3, 4);
        Method dst2Method = GridPoint2Mutant.class.getDeclaredMethod("dst2", GridPoint2Mutant.class);
        dst2Method.setAccessible(true);
        // Act
        float result = (float) dst2Method.invoke(point1, point2);
        // Assert
        assertEquals(25.0f, result, 0.001);
    }
}
