package com.badlogic.gdx.math;

import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Vector3_nor_29_3_Test {

    private static final float EPSILON = 0.0001f;

    @Test
    void testNor() throws Exception {
        Vector3 vector = new Vector3(5, 0, 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, 5, 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, 0, 5);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(-5, 0, 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, -5, 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, 0, -5);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3((float) Math.sqrt(3), (float) (Math.sqrt(3) / 2), 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3((float) (Math.sqrt(3) / 2), 0, (float) Math.sqrt(3));
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(-(float) Math.sqrt(3), -(float) (Math.sqrt(3) / 2), 0);
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, -(float) Math.sqrt(3), -(float) Math.sqrt(3));
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(0, (float) Math.sqrt(3) / 2, -(float) Math.sqrt(3));
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
        vector = new Vector3(-(float) Math.sqrt(3), (float) Math.sqrt(3) / 2, -(float) Math.sqrt(3));
        vector.nor();
        assertEquals(1f, vector.len2(), EPSILON);
    }
}
