package com.libgdx.test;

import com.badlogic.gdx.math.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testClamp() {
        assertEquals(0, MathUtils.clamp(-1, 0, 100));
        assertEquals(50, MathUtils.clamp(50, 0, 100));
        assertEquals(100, MathUtils.clamp(200, 0, 100));
    }

    @Test
    public void testLerp() {
        assertEquals(5, MathUtils.lerp(0, 10, 0.5f), 0.0001f);
        assertEquals(0, MathUtils.lerp(0, 10, 0));
        assertEquals(10, MathUtils.lerp(0, 10, 1));
    }
}