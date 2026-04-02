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

class // Add more tests as needed to ensure complete coverage
Vector3_cpy_6_0_Test {

    @BeforeEach
    void setUp() {
        // any necessary setup code here
    }

    @AfterEach
    void tearDown() {
        // Any necessary cleanup code here
    }

    @Test
    void testCpy() throws Exception {
        Vector3 vector = new Vector3(1, 2, 3);
        Vector3 copy = (Vector3) invokeMethod(vector, "cpy");
        assertEquals(vector.x, copy.x);
        assertEquals(vector.y, copy.y);
        assertEquals(vector.z, copy.z);
    }

    private static Object invokeMethod(Object instance, String methodName) throws Exception {
        Class<?> clazz = instance.getClass();
        return clazz.getMethod(methodName).invoke(instance);
    }

    @Test
    void testCpyWithNull() throws Exception {
        Vector3 vector = null;
        assertThrows(NullPointerException.class, () -> invokeMethod(vector, "cpy"));
    }
}
