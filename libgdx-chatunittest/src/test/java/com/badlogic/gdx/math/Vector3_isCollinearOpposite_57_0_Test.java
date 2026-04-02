package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector3;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_isCollinearOpposite_57_0_Test {

    @Test
    public void testIsCollinearOpposite_sameDirection() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
        assertTrue(v1.isCollinearOpposite(v2, 0));
    }

    @Test
    public void testIsCollinearOpposite_oppositeDirection() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 0, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0));
    }

    @Test
    public void testIsCollinearOpposite_collinear() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(0, 1, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0));
    }

    @Test
    public void testIsCollinearOpposite_collinearAndOpposite() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 0, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0));
    }

    @Test
    public void testIsCollinearOpposite_collinearAndOppositeWithEpsilon() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 0, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0.5f));
    }

    @Test
    public void testIsCollinearOpposite_collinearWithEpsilon() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(0, 1, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0.5f));
    }

    @Test
    public void testIsCollinearOpposite_oppositeWithEpsilon() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(-1, 0, 0);
        assertFalse(v1.isCollinearOpposite(v2, 0.5f));
    }

    @Test
    public void testIsCollinearOpposite_sameDirectionWithEpsilon() {
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
        assertTrue(v1.isCollinearOpposite(v2, 0.5f));
    }
}
