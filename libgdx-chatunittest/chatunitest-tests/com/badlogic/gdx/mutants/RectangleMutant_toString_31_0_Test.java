package com.badlogic.gdx.mutants;

import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Scaling;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;

public class // ... (other test methods remain the same)
RectangleMutant_toString_31_0_Test {

    @Test
    public void testToString() {
        RectangleMutant rectangle = new RectangleMutant(1, 2, 3, 4);
        assertEquals("[1.0,2.0,3.0,4.0]", rectangle.toString());
    }
}
