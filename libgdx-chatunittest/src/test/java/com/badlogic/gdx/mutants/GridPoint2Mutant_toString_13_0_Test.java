package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_toString_13_0_Test {

    @Test
    void testToString() throws Exception {
        // Arrange
        GridPoint2Mutant point = new GridPoint2Mutant(5, 10);
        // Act
        String result = invokePrivateMethod(point, "toString");
        // Assert
        Assertions.assertEquals("(5, 10)", result);
    }

    private <T> T invokePrivateMethod(Object target, String methodName, Object... args) throws Exception {
        Class<?>[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getClass();
        }
        return (T) target.getClass().getMethod(methodName, argTypes).invoke(target, args);
    }
}
