package com.badlogic.gdx.mutants;

import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

class CircleMutant_toString_13_0_Test {

    @Test
    void testToString() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CircleMutant circle = new CircleMutant(5f, 10f, 15f);
        // Get the toString method
        Method toStringMethod = CircleMutant.class.getDeclaredMethod("toString");
        // Invoke the toString method using reflection
        String result = (String) toStringMethod.invoke(circle);
        assertEquals("5.0,10.0,15.0", result);
    }
}
