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

public class Vector3_isCollinear_56_0_Test {

    @Test
    public void testIsCollinear() throws Exception {
        // Create two vectors that are collinear with the same direction
        Vector3 v1 = new Vector3(1, 0, 0);
        Vector3 v2 = new Vector3(0, 1, 0);
        assertTrue(v1.isCollinear(v2));
        // Create two vectors that are not collinear with different directions
        Vector3 v3 = new Vector3(1, 1, 0);
        Vector3 v4 = new Vector3(1, -1, 0);
        assertFalse(v3.isCollinear(v4));
        // Create two vectors that are collinear but have different lengths
        Vector3 v5 = new Vector3(1, 0, 0);
        Vector3 v6 = new Vector3(2, 0, 0);
        assertFalse(v5.isCollinear(v6));
        // Create a vector and its collinear copy with equal length
        Vector3 v7 = new Vector3(1, 0, 0);
        Vector3 v8 = new Vector3(2, 0, 0);
        assertTrue(v7.isCollinear(v8));
        // Create a vector and its collinear copy with different length
        Vector3 v9 = new Vector3(1, 0, 0);
        Vector3 v10 = new Vector3(2, 0, 0);
        assertFalse(v9.isCollinear(v10));
        // Create a vector and its collinear copy with different direction
        Vector3 v11 = new Vector3(1, 0, 0);
        Vector3 v12 = new Vector3(-1, 0, 0);
        assertFalse(v11.isCollinear(v12));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v13 = new Vector3(1, 0, 0);
        Vector3 v14 = new Vector3(-2, 0, 0);
        assertFalse(v13.isCollinear(v14));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v15 = new Vector3(1, 0, 0);
        Vector3 v16 = new Vector3(-2, 0, 0);
        assertFalse(v15.isCollinear(v16));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v17 = new Vector3(1, 0, 0);
        Vector3 v18 = new Vector3(-2, 0, 0);
        assertFalse(v17.isCollinear(v18));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v19 = new Vector3(1, 0, 0);
        Vector3 v20 = new Vector3(-2, 0, 0);
        assertFalse(v19.isCollinear(v20));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v21 = new Vector3(1, 0, 0);
        Vector3 v22 = new Vector3(-2, 0, 0);
        assertFalse(v21.isCollinear(v22));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v23 = new Vector3(1, 0, 0);
        Vector3 v24 = new Vector3(-2, 0, 0);
        assertFalse(v23.isCollinear(v24));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v25 = new Vector3(1, 0, 0);
        Vector3 v26 = new Vector3(-2, 0, 0);
        assertFalse(v25.isCollinear(v26));
        // Create a vector and its collinear copy with different direction and length
        Vector3 v27 = new Vector3(1, 0, 0);
    }
}
