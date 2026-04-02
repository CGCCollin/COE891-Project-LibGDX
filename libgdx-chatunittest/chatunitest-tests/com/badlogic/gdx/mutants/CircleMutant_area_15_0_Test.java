package com.badlogic.gdx.mutants;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class CircleMutant_area_15_0_Test {

    @Test
    void testArea() throws Exception {
        CircleMutant circle = new CircleMutant(1, 2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithZeroRadius() throws Exception {
        CircleMutant circle = new CircleMutant(1, 2, 0);
        assertEquals(0, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithNegativeRadius() throws Exception {
        CircleMutant circle = new CircleMutant(1, 2, -3);
        assertEquals(-MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMaxFloatRadius() throws Exception {
        CircleMutant circle = new CircleMutant(1, 2, Float.MAX_VALUE);
        assertEquals(MathUtils.PI * Float.MAX_VALUE * Float.MAX_VALUE, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMinFloatRadius() throws Exception {
        CircleMutant circle = new CircleMutant(1, 2, -Float.MIN_VALUE);
        assertEquals(-MathUtils.PI * Float.MIN_VALUE * Float.MIN_VALUE, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithZeroX() throws Exception {
        CircleMutant circle = new CircleMutant(0, 2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithZeroY() throws Exception {
        CircleMutant circle = new CircleMutant(1, 0, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithNegativeX() throws Exception {
        CircleMutant circle = new CircleMutant(-1, 2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithNegativeY() throws Exception {
        CircleMutant circle = new CircleMutant(1, -2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithNegativeXAndY() throws Exception {
        CircleMutant circle = new CircleMutant(-1, -2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMaxFloatX() throws Exception {
        CircleMutant circle = new CircleMutant(Float.MAX_VALUE, 2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMaxFloatY() throws Exception {
        CircleMutant circle = new CircleMutant(1, Float.MAX_VALUE, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMinFloatX() throws Exception {
        CircleMutant circle = new CircleMutant(-Float.MIN_VALUE, 2, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }

    @Test
    void testAreaWithMinFloatY() throws Exception {
        CircleMutant circle = new CircleMutant(1, -Float.MIN_VALUE, 3);
        assertEquals(MathUtils.PI * 9, circle.area(), 0.0001f);
    }
}
