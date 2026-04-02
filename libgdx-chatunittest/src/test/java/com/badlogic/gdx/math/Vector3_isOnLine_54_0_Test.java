package com.badlogic.gdx.math;

import java.lang.reflect.Field;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Vector3_isOnLine_54_0_Test {

    @Test
    void testIsOnLineWithNullArgument() {
        Vector3 v1 = new Vector3(1, 0, 0);
        assertThrows(NullPointerException.class, () -> v1.isOnLine(null));
    }
}
