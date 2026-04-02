package com.badlogic.gdx.mutants;

import static com.badlogic.gdx.mutants.RectangleMutant.*;
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

public class RectangleMutant_contains_18_0_Test {

    @Test
    void testContains() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(0, 0, 10, 10);
        RectangleMutant rect2 = new RectangleMutant(5, 5, 5, 5);
        assertTrue(rect1.contains(rect2));
        RectangleMutant rect3 = new RectangleMutant(-5, -5, 15, 15);
        assertFalse(rect1.contains(rect3));
    }
}
