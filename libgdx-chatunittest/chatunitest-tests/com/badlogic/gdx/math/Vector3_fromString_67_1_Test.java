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

class Vector3_fromString_67_1_Test {

    @Test
    void fromStringValidInput() {
        Vector3 vector = new Vector3();
        Vector3 result = vector.fromString("(1,2,3)");
        assertEquals(1f, result.x);
        assertEquals(2f, result.y);
        assertEquals(3f, result.z);
    }

    @Test
    void fromStringInvalidInput() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("malformed input"));
    }

    @Test
    void fromStringEmptyInput() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("()"));
    }

    @Test
    void fromStringMissingParentheses() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("1,2,3"));
    }

    @Test
    void fromStringExtraParentheses() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("((1,2,3))"));
    }

    @Test
    void fromStringMissingComma() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("(1,2)"));
    }

    @Test
    void fromStringExtraComma() {
        Vector3 vector = new Vector3();
        assertThrows(GdxRuntimeException.class, () -> vector.fromString("(1,2,3,"));
    }
}
