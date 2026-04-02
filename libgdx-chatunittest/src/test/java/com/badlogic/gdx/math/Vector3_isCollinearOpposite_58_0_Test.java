package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_isCollinearOpposite_58_0_Test {

    @Test
    void testIsCollinearOpposite() throws Exception {
        Vector3 vector1 = new Vector3(1, 0, 0);
        Vector3 vector2 = new Vector3(0, 1, 0);
        assertFalse(vector1.isCollinearOpposite(vector2));
        Vector3 vector3 = new Vector3(0, 0, 1);
        Vector3 vector4 = new Vector3(0, -1, 0);
        assertTrue(vector3.isCollinearOpposite(vector4));
        Vector3 vector5 = new Vector3(0, 1, 0);
        Vector3 vector6 = new Vector3(1, 0, 0);
        assertFalse(vector5.isCollinearOpposite(vector6));
        Vector3 vector7 = new Vector3(0, 0, -1);
        Vector3 vector8 = new Vector3(0, 1, 0);
        assertTrue(vector7.isCollinearOpposite(vector8));
        Vector3 vector9 = new Vector3(0, 1, 0);
        Vector3 vector10 = new Vector3(-1, 0, 0);
        assertFalse(vector9.isCollinearOpposite(vector10));
    }
}
