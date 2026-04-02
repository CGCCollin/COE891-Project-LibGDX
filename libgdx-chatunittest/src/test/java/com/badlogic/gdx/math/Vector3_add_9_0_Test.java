package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_add_9_0_Test {

    @Test
    public void testAdd() throws Exception {
        Vector3 vector = new Vector3(10, 20, 30);
        float value = 5f;
        vector.add(value);
        assertEquals(15f, vector.x, 0.001);
        assertEquals(25f, vector.y, 0.001);
        assertEquals(35f, vector.z, 0.001);
    }

    @Test
    public void testAddReflective() throws Exception {
        Vector3 vector = new Vector3(10, 20, 30);
        float value = 5f;
        java.lang.reflect.Method addMethod = Vector3.class.getDeclaredMethod("add", float.class);
        addMethod.setAccessible(true);
        addMethod.invoke(vector, value);
        assertEquals(15f, vector.x, 0.001);
        assertEquals(25f, vector.y, 0.001);
        assertEquals(35f, vector.z, 0.001);
    }
}
