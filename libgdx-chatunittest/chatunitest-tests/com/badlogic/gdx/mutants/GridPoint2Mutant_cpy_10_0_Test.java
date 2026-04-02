package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_cpy_10_0_Test {

    @Test
    void testCpy() throws Exception {
        GridPoint2Mutant point = new GridPoint2Mutant(1, 2);
        GridPoint2Mutant copy = point.cpy();
        assertEquals(point.x, copy.x);
        assertEquals(point.y, copy.y);
    }
}
