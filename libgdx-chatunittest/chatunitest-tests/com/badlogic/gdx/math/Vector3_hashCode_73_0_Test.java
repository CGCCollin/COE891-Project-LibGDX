package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
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

public class Vector3_hashCode_73_0_Test {

    @Test
    void testHashCode() throws Exception {
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(1, 2, 4);
        assertEquals(v1.hashCode(), v1.hashCode());
        assertNotEquals(v1.hashCode(), v2.hashCode());
        // Test with reflection to invoke private method NumberUtils.floatToIntBits()
        Class<?> numberUtilsClass = Class.forName("com.badlogic.gdx.utils.NumberUtils");
        Method floatToIntBitsMethod = numberUtilsClass.getDeclaredMethod("floatToIntBits", float.class);
        floatToIntBitsMethod.setAccessible(true);
        int bit1 = (int) floatToIntBitsMethod.invoke(null, 1f);
        int bit2 = (int) floatToIntBitsMethod.invoke(null, 2f);
        int bit3 = (int) floatToIntBitsMethod.invoke(null, 3f);
        Vector3 v3 = new Vector3(bit1, bit2, bit3);
        assertEquals(v1.hashCode(), v3.hashCode());
    }
}
