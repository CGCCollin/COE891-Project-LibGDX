package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_equals_11_0_Test {

    @Test
    void equals_sameObject() {
        GridPoint2Mutant point = new GridPoint2Mutant(1, 2);
        assertTrue(point.equals(point));
    }

    @Test
    void equals_null() {
        GridPoint2Mutant point = new GridPoint2Mutant(1, 2);
        assertFalse(point.equals(null));
    }

    @Test
    void equals_differentClass() {
        GridPoint2Mutant point = new GridPoint2Mutant(1, 2);
        Object obj = new Object();
        assertFalse(point.equals(obj));
    }

    @Test
    void equals_sameValue() {
        GridPoint2Mutant point1 = new GridPoint2Mutant(1, 2);
        GridPoint2Mutant point2 = new GridPoint2Mutant(1, 2);
        assertTrue(point1.equals(point2));
    }

    @Test
    void equals_differentValue() {
        GridPoint2Mutant point1 = new GridPoint2Mutant(1, 2);
        GridPoint2Mutant point2 = new GridPoint2Mutant(3, 4);
        assertFalse(point1.equals(point2));
    }
}
