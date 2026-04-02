package com.badlogic.gdx.math;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;

public class Vector3_epsilonEquals_77_0_Test {

    private static final float EPSILON = 0.0001f;

    @BeforeEach
    void setUp() {
        // Perform any necessary setup before each test
    }

    @AfterEach
    void tearDown() {
        // Perform any necessary cleanup after each test
    }

    @Test
    void epsilonEquals_whenVectorsAreEqualWithinEpsilon_returnsTrue() {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(1, 2, 3);
        boolean result = vector1.epsilonEquals(vector2, EPSILON);
        Assertions.assertTrue(result);
    }

    @Test
    void epsilonEquals_whenVectorsAreNotEqualWithinEpsilon_returnsFalse() {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = new Vector3(1.0001f, 2, 3);
        boolean result = vector1.epsilonEquals(vector2, EPSILON);
        Assertions.assertFalse(result);
    }

    @Test
    void epsilonEquals_whenOneOfTheVectorsIsNull_throwsNullPointerException() {
        Vector3 vector1 = new Vector3(1, 2, 3);
        Vector3 vector2 = null;
        Assertions.assertThrows(NullPointerException.class, () -> vector1.epsilonEquals(vector2, EPSILON));
    }
}
