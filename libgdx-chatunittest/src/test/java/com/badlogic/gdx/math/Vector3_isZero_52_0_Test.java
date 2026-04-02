package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_isZero_52_0_Test {

    @Test
    public void testIsZero() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        // create a new instance of Vector3 with x=0, y=0, z=0
        Vector3 vector = new Vector3(0f, 0f, 0f);
        // get the private method isZero using reflection
        Method methodIsZero = Vector3.class.getDeclaredMethod("isZero", float.class);
        methodIsZero.setAccessible(true);
        // test with margin=1e-6
        assertTrue((boolean) methodIsZero.invoke(vector, 1e-6f));
        // test with margin=-1e-6
        assertFalse((boolean) methodIsZero.invoke(vector, -1e-6f));
        // set the vector to non-zero values and test again
        Field fieldX = Vector3.class.getDeclaredField("x");
        fieldX.setAccessible(true);
        fieldX.set(vector, 0.00001f);
        assertFalse((boolean) methodIsZero.invoke(vector, 1e-6f));
        // set the vector back to zero and test again
        fieldX.set(vector, 0f);
        assertTrue((boolean) methodIsZero.invoke(vector, 1e-6f));
    }
}
