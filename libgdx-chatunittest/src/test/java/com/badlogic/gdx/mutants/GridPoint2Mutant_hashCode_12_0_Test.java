package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

class GridPoint2Mutant_hashCode_12_0_Test {

    @Test
    void testHashCode() throws Exception {
        GridPoint2Mutant point1 = new GridPoint2Mutant(3, 4);
        GridPoint2Mutant point2 = new GridPoint2Mutant(point1);
        assertNotEquals(point1.hashCode(), point2.hashCode());
        point2.set(0, 0);
        assertEquals(point1.hashCode(), point2.hashCode());
    }
}
