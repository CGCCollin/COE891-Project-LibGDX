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

public class RectangleMutant_hashCode_35_0_Test {

    @Test
    public void testHashCode() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(1, 2, 3, 4);
        RectangleMutant rect2 = new RectangleMutant(1, 2, 3, 4);
        RectangleMutant rect3 = new RectangleMutant(5, 6, 7, 8);
        assertEquals(rect1.hashCode(), rect2.hashCode());
        assertNotEquals(rect1.hashCode(), rect3.hashCode());
    }
}
