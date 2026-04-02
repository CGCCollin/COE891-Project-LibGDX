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

public class Vector3_slerp_65_0_Test {

    @Test
    void testSlerp() {
        // create two vectors
        Vector3 v1 = new Vector3(0, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
        // calculate slerp result
        Vector3 slerped = v1.slerp(v2, 0.5f);
        // check that slerp result is halfway between v1 and v2
        assertEquals(0.7071067811865476f, slerped.x, 0.0001f);
        assertEquals(0.0f, slerped.y, 0.0001f);
        assertEquals(0.7071067811865476f, slerped.z, 0.0001f);
    }

    @Test
    void testSlerpEdgeCases() {
        // create two vectors
        Vector3 v1 = new Vector3(0, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
        // check that slerp with alpha close to 1 returns v2
        assertEquals(v2.x, v2.slerp(v1, 0.999f).x, 0.0001f);
        assertEquals(v2.y, v2.slerp(v1, 0.999f).y, 0.0001f);
        assertEquals(v2.z, v2.slerp(v1, 0.999f).z, 0.0001f);
        // check that slerp with alpha close to -1 returns v1
        assertEquals(v1.x, v1.slerp(v2, -0.999f).x, 0.0001f);
        assertEquals(v1.y, v1.slerp(v2, -0.999f).y, 0.0001f);
        assertEquals(v1.z, v1.slerp(v2, -0.999f).z, 0.0001f);
    }

    @Test
    void testSlerpIdenticalVectors() {
        // create two identical vectors
        Vector3 v = new Vector3(1, 0, 0);
        // check that slerp with any alpha returns the same vector
        assertEquals(v.x, v.slerp(v, 0.5f).x, 0.0001f);
        assertEquals(v.y, v.slerp(v, 0.5f).y, 0.0001f);
        assertEquals(v.z, v.slerp(v, 0.5f).z, 0.0001f);
    }

    @Test
    void testSlerpZeroAlpha() {
        // create two vectors
        Vector3 v1 = new Vector3(0, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
        // check that slerp with alpha 0 returns the first vector
        assertEquals(v1.x, v2.slerp(v1, 0f).x, 0.0001f);
        assertEquals(v1.y, v2.slerp(v1, 0f).y, 0.0001f);
        assertEquals(v1.z, v2.slerp(v1, 0f).z, 0.0001f);
    }

    @Test
    void testSlerpOneAlpha() {
        // create two vectors
        Vector3 v1 = new Vector3(0, 0, 0);
        Vector3 v2 = new Vector3(1, 0, 0);
    }
}
