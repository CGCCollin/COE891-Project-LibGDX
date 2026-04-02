package com.badlogic.gdx.math;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Vector3_dst2_28_0_Test {

    @InjectMocks
    private Vector3 v1;

    @Test
    void testDst2() throws Exception {
        Vector3 v2 = new Vector3(2, 0, 0);
        assertEquals(1.0f, v1.dst2(v2), 0.0001);
        // Test with reflection to invoke private method
        Method dst2Method = Vector3.class.getDeclaredMethod("dst2", float.class, float.class, float.class);
        dst2Method.setAccessible(true);
        assertEquals(1.0f, (float) dst2Method.invoke(v1, 2, 0, 0), 0.0001);
    }
}
