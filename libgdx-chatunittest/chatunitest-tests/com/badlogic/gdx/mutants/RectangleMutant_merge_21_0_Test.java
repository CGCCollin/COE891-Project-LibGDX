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

public class RectangleMutant_merge_21_0_Test {

    @Test
    public void testMerge() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(0, 0, 5, 5);
        RectangleMutant rect2 = new RectangleMutant(3, 3, 10, 10);
        RectangleMutant mergedRect = rect1.merge(rect2);
        assertEquals(0, mergedRect.getX());
        assertEquals(0, mergedRect.getY());
        assertEquals(13, mergedRect.getWidth());
        assertEquals(13, mergedRect.getHeight());
    }

    @Test
    public void testMergeOverlapping() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(0, 0, 5, 5);
        RectangleMutant rect2 = new RectangleMutant(3, 3, 10, 10);
        RectangleMutant mergedRect = rect1.merge(rect2);
        assertEquals(mergedRect, rect1);
    }

    @Test
    public void testMergeDisjoint() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(0, 0, 5, 5);
        RectangleMutant rect2 = new RectangleMutant(-10, -10, 10, 10);
        RectangleMutant mergedRect = rect1.merge(rect2);
        assertEquals(-10, mergedRect.getX());
        assertEquals(-10, mergedRect.getY());
        assertEquals(20, mergedRect.getWidth());
        assertEquals(20, mergedRect.getHeight());
    }

    @Test
    public void testMergeEmpty() throws Exception {
        RectangleMutant rect1 = new RectangleMutant();
        RectangleMutant rect2 = new RectangleMutant(3, 3, 10, 10);
        RectangleMutant mergedRect = rect1.merge(rect2);
        assertEquals(mergedRect, rect2);
    }

    @Test
    public void testMergeNegative() throws Exception {
        RectangleMutant rect1 = new RectangleMutant(-5, -5, 5, 5);
        RectangleMutant rect2 = new RectangleMutant(0, 0, 10, 10);
        RectangleMutant mergedRect = rect1.merge(rect2);
        assertEquals(-5, mergedRect.getX());
        assertEquals(-5, mergedRect.getY());
        assertEquals(15, mergedRect.getWidth());
        assertEquals(15, mergedRect.getHeight());
    }
}
