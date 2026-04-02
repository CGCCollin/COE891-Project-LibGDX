package com.badlogic.gdx.mutants;

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

class RectangleMutant_contains_15_0_Test {

    @Test
    void contains() throws Exception {
        RectangleMutant rectangle = new RectangleMutant(0, 0, 10, 10);
        Assertions.assertTrue(rectangle.contains(5, 5));
        Assertions.assertFalse(rectangle.contains(-1, -1));
        Assertions.assertFalse(rectangle.contains(11, 11));
        Assertions.assertFalse(rectangle.contains(10, 10));
    }
}
