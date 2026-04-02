package com.badlogic.gdx.math;

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

public class // ... other tests remain the same
Rectangle_perimeter_34_0_Test {

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals(14f, rectangle.perimeter());
    }
}
