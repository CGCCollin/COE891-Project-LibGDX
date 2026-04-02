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

class GridPoint2Mutant_sub_8_0_Test {

    @Test
    void testSub() throws Exception {
        // Create two instances of GridPoint2Mutant with different coordinates
        GridPoint2Mutant point1 = new GridPoint2Mutant(5, 10);
        GridPoint2Mutant point2 = new GridPoint2Mutant(3, 4);
        // Invoke the sub method using reflection
        Method subMethod = GridPoint2Mutant.class.getDeclaredMethod("sub", GridPoint2Mutant.class);
        subMethod.setAccessible(true);
        GridPoint2Mutant result = (GridPoint2Mutant) subMethod.invoke(point1, point2);
        // Check that the coordinates of the resulting point are correct
        assertEquals(2, result.x);
        assertEquals(6, result.y);
    }
}
