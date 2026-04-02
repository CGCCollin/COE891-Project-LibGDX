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

public class GridPoint2Mutant_sub_9_0_Test {

    @Test
    void sub_shouldSubtractCorrectly() throws Exception {
        GridPoint2Mutant point = new GridPoint2Mutant(10, 20);
        Method subMethod = GridPoint2Mutant.class.getDeclaredMethod("sub", int.class, int.class);
        subMethod.setAccessible(true);
        GridPoint2Mutant result = (GridPoint2Mutant) subMethod.invoke(point, 5, 10);
        assert result.x == 5;
        assert result.y == 10;
    }

    @Test
    void sub_shouldReturnThis() throws Exception {
        GridPoint2Mutant point = new GridPoint2Mutant(10, 20);
        Method subMethod = GridPoint2Mutant.class.getDeclaredMethod("sub", int.class, int.class);
        subMethod.setAccessible(true);
        GridPoint2Mutant result = (GridPoint2Mutant) subMethod.invoke(point, 5, 10);
        assert result == point;
    }
}
