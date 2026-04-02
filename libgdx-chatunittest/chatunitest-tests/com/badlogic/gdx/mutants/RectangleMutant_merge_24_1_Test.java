package com.badlogic.gdx.mutants;

import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.badlogic.gdx.math.*;

public class RectangleMutant_merge_24_1_Test {

    private final RectangleMutant rectangle = new RectangleMutant();

    @Test
    void merge() throws Exception {
        // Arrange
        Vector2[] vecs = new Vector2[] { new Vector2(1, 2), new Vector2(3, 4), new Vector2(5, 6) };
        Method mergeMethod = RectangleMutant.class.getDeclaredMethod("merge", Vector2[].class);
        mergeMethod.setAccessible(true);
        // Act
        RectangleMutant result = (RectangleMutant) mergeMethod.invoke(rectangle, new Object[] { vecs });
        // Assert
        assertEquals(1f, rectangle.x);
        assertEquals(2f, rectangle.y);
        assertEquals(5f, rectangle.width);
        assertEquals(6f, rectangle.height);
    }
}
