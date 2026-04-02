package com.badlogic.gdx.mutants;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;

class RectangleMutant_getCenter_26_1_Test {

    @Test
    void testGetCenter() throws Exception {
        RectangleMutant rectangle = new RectangleMutant();
        rectangle.x = 1f;
        rectangle.y = 2f;
        rectangle.width = 3f;
        rectangle.height = 4f;
        Vector2 vector = new Vector2();
        Method getCenter = RectangleMutant.class.getDeclaredMethod("getCenter", Vector2.class);
        getCenter.setAccessible(true);
        vector = (Vector2) getCenter.invoke(rectangle, vector);
        assertEquals(2f, vector.x, 0.0001);
        assertEquals(3f, vector.y, 0.0001);
    }
}
