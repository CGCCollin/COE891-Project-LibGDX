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

public class Vector3_add_8_0_Test {

    private Vector3 vector, otherVector;

    @BeforeEach
    void setUp() {
        vector = new Vector3(1, 2, 3);
        otherVector = new Vector3(4, 5, 6);
    }

    @Test
    void testAdd() throws Exception {
        // Arrange: Set up the objects needed for the test.
        float x = vector.x + otherVector.x;
        float y = vector.y + otherVector.y;
        float z = vector.z + otherVector.z;
        // Act: Invoke the method under test.
        vector.add(otherVector);
        // Assert: Verify that the result matches the expected outcome.
        assertEquals(x, vector.x, 0.0001f);
        assertEquals(y, vector.y, 0.0001f);
        assertEquals(z, vector.z, 0.0001f);
    }

    @Test
    void testAddWithNegativeValues() throws Exception {
        // Arrange: Set up the objects needed for the test.
        otherVector = new Vector3(-4, -5, -6);
        float x = vector.x + otherVector.x;
        float y = vector.y + otherVector.y;
        float z = vector.z + otherVector.z;
        // Act: Invoke the method under test.
        vector.add(otherVector);
        // Assert: Verify that the result matches the expected outcome.
        assertEquals(x, vector.x, 0.0001f);
        assertEquals(y, vector.y, 0.0001f);
        assertEquals(z, vector.z, 0.0001f);
    }

    @Test
    void testAddWithZeroValues() throws Exception {
        // Arrange: Set up the objects needed for the test.
        otherVector = new Vector3(0, 0, 0);
        float x = vector.x + otherVector.x;
        float y = vector.y + otherVector.y;
        float z = vector.z + otherVector.z;
        // Act: Invoke the method under test.
        vector.add(otherVector);
        // Assert: Verify that the result matches the expected outcome.
        assertEquals(x, vector.x, 0.0001f);
        assertEquals(y, vector.y, 0.0001f);
        assertEquals(z, vector.z, 0.0001f);
    }

    @Test
    void testAddWithLargeValues() throws Exception {
        // Arrange: Set up the objects needed for the test.
        otherVector = new Vector3(10000, 20000, 30000);
        float x = vector.x + otherVector.x;
        float y = vector.y + otherVector.y;
        float z = vector.z + otherVector.z;
        // Act: Invoke the method under test.
        vector.add(otherVector);
        // Assert: Verify that the result matches the expected outcome.
        assertEquals(x, vector.x, 0.0001f);
        assertEquals(y, vector.y, 0.0001f);
        assertEquals(z, vector.z, 0.0001f);
    }

    @Test
    void testAddWithSingleValue() throws Exception {
        // Arrange: Set up the objects needed for the test.
        otherVector = new Vector3(7, 8, 9);
        float x = vector.x + otherVector.x;
        float y = vector.y + otherVector.y;
        float z = vector.z + otherVector.z;
        // Act: Invoke the method under test.
        vector.add(otherVector.x, otherVector.y, otherVector.z);
    }
}
