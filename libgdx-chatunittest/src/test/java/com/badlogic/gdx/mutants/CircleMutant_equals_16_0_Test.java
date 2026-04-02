package com.badlogic.gdx.mutants;

import com.badlogic.gdx.mutants.CircleMutant;
import java.lang.reflect.Field;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

class CircleMutant_equals_16_0_Test {

    @Test
    public void testEqualsWithNullObject() throws NoSuchFieldException, IllegalAccessException {
        CircleMutant circle = new CircleMutant(1, 2, 3);
        assertFalse(circle.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClasses() throws NoSuchFieldException, IllegalAccessException {
        CircleMutant circle = new CircleMutant(1, 2, 3);
        Circle otherCircle = new Circle();
        assertFalse(circle.equals(otherCircle));
    }
}
