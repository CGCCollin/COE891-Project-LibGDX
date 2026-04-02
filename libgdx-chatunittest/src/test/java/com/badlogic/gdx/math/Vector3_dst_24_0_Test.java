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

class Vector3_dst_24_0_Test {

    private Vector3 vector3;

    private Field[] fields;

    private Method dstMethod;

    @BeforeEach
    void setUp() throws Exception {
        vector3 = new Vector3(0, 0, 0);
        fields = Vector3.class.getDeclaredFields();
        dstMethod = Vector3.class.getMethod("dst", Vector3.class);
        for (Field field : fields) {
            field.setAccessible(true);
        }
    }

    @Test
    void testDst() throws Exception {
        Vector3 vector2 = new Vector3(1, 1, 1);
        float result = (Float) dstMethod.invoke(vector3, vector2);
        assertEquals(Math.sqrt(3), result, 0.0001);
        vector2 = new Vector3(2, 2, 2);
        result = (Float) dstMethod.invoke(vector3, vector2);
        assertEquals(Math.sqrt(12), result, 0.0001);
    }
}
