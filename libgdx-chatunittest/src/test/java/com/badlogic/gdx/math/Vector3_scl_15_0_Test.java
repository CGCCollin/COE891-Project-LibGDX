package com.badlogic.gdx.math;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_scl_15_0_Test {

    private static final float EPSILON = 0.0001f;

    @Test
    void testScl() throws Exception {
        // create a new instance of Vector3
        Vector3 v = new Vector3();
        // set the fields to some values
        v.x = 2.0f;
        v.y = 3.0f;
        v.z = 4.0f;
        // invoke the scl method using reflection
        Method sclMethod = Vector3.class.getDeclaredMethod("scl", float.class, float.class, float.class);
        Object result = sclMethod.invoke(v, 2.0f, 2.0f, 2.0f);
        // check that the result is a Vector3 instance
        assertTrue(result instanceof Vector3);
        // cast the result to a Vector3 instance
        Vector3 v2 = (Vector3) result;
        // check that the fields of the result are correct
        assertEquals(4.0f, v2.x, EPSILON);
        assertEquals(6.0f, v2.y, EPSILON);
        assertEquals(8.0f, v2.z, EPSILON);
        // check that the original fields of v are not changed
        assertEquals(2.0f, v.x, EPSILON);
        assertEquals(3.0f, v.y, EPSILON);
        assertEquals(4.0f, v.z, EPSILON);
    }

    @Test
    void testSclZero() throws Exception {
        // create a new instance of Vector3
        Vector3 v = new Vector3();
        // set the fields to Some values
        v.x = 2.0f;
        v.y = 3.0f;
        v.z = 4.0f;
        // invoke the scl method using reflection
        Method sclMethod = Vector3.class.getDeclaredMethod("scl", float.class, float.class, float.class);
        Object result = sclMethod.invoke(v, 0.0f, 0.0f, 0.0f);
        // check that the result is a Vector3 instance
        assertTrue(result instanceof Vector3);
        // cast the result to a Vector3 instance
        Vector3 v2 = (Vector3) result;
        // check that the fields of the result are correct
        assertEquals(0.0f, v2.x, EPSILON);
        assertEquals(0.0f, v2.y, EPSILON);
        assertEquals(0.0f, v2.z, EPSILON);
        // check that the original fields of v are not changed
        assertEquals(2.0f, v.x, EPSILON);
        assertEquals(3.0f, v.y, EPSILON);
        assertEquals(4.0f, v.z, EPSILON);
    }

    @Test
    void testSclNegative() throws Exception {
        // create a new instance of Vector3
        Vector3 v = new Vector3();
        // set the fields to Some values
        v.x = 2.0f;
        v.y = 3.0f;
        v.z = 4.0f;
        // invoke the scl method using reflection
        Method sclMethod = Vector3.class.getDeclaredMethod("scl", float.class, float.class, float.class);
        Object result = sclMethod.invoke(v, -2.0f, -2.0f, -2.0f);
        // check that the result is a Vector3 instance
        assertTrue(result instanceof Vector3);
        // cast the result to a Vector3 instance
        Vector3 v2 = (Vector3) result;
        // check that the fields of the result are correct
        assertEquals(-4.0f, v2.x, EPSILON);
    }
}
