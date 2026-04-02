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

public class Vector3_nor_29_0_Test {

    @Test
    void testNor() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Act
        vector.nor();
        // Assert
        assertEquals(1f, vector.x, 0.0001f);
        assertEquals(0f, vector.y, 0.0001f);
        assertEquals(0f, vector.z, 0.0001f);
    }

    @Test
    void testNorWithZeroVector() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(0, 0, 0);
        // Act
        vector.nor();
        // Assert
        assertEquals(0f, vector.x, 0.0001f);
        assertEquals(0f, vector.y, 0.0001f);
        assertEquals(0f, vector.z, 0.0001f);
    }

    @Test
    void testNorWithUnitVector() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 0, 0);
        // Act
        vector.nor();
        // Assert
        assertEquals(1f, vector.x, 0.0001f);
        assertEquals(0f, vector.y, 0.0001f);
        assertEquals(0f, vector.z, 0.0001f);
    }

    @Test
    void testNorWithNonUnitVector() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(2, 0, 0);
        // Act
        vector.nor();
        // Assert
        assertEquals(1f, vector.x, 0.0001f);
        assertEquals(0f, vector.y, 0.0001f);
        assertEquals(0f, vector.z, 0.0001f);
    }

    @Test
    void testNorWithOtherVector() throws Exception {
        // Arrange
        Vector3 vector = new Vector3(1, 2, 3);
        // Act
        vector.nor();
        // Assert
        assertEquals(0.26726124f, vector.x, 0.0001f);
        assertEquals(0.53452248f, vector.y, 0.0001f);
        assertEquals(0.80178373f, vector.z, 0.0001f);
    }
}
