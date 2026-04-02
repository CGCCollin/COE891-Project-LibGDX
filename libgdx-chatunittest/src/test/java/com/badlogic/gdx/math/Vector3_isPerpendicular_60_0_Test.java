package com.badlogic.gdx.math;

import com.badlogic.gdx.math.MathUtils;
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

public class Vector3_isPerpendicular_60_0_Test {

    private Vector3 vector1, vector2;

    @BeforeEach
    public void setUp() {
        vector1 = new Vector3(1, 0, 0);
        vector2 = new Vector3(0, 1, 0);
    }

    @Test
    public void testIsPerpendicularWithEpsilonZero() {
        assert vector1.isPerpendicular(vector2, 0f) : "Vectors should be perpendicular with epsilon zero";
    }

    @Test
    public void testIsPerpendicularWithEpsilonSmall() {
        assert vector1.isPerpendicular(vector2, 0.0001f) : "Vectors should be perpendicular with epsilon small";
    }

    @Test
    public void testIsNotPerpendicularWithEpsilonZero() {
        Vector3 nonPerpendicularVector = new Vector3(1, 1, 1);
        assert !nonPerpendicularVector.isPerpendicular(vector2, 0f) : "Vectors should not be perpendicular with epsilon zero";
    }

    @Test
    public void testIsNotPerpendicularWithEpsilonSmall() {
        Vector3 nonPerpendicularVector = new Vector3(1, 1, 1);
        assert !nonPerpendicularVector.isPerpendicular(vector2, 0.0001f) : "Vectors should not be perpendicular with epsilon small";
    }

    @Test
    public void testIsNotPerpendicularWithNull() {
        assert vector1.isPerpendicular(null, 0f) == false;
    }

    @Test
    public void testIsNotPerpendicularWithZeroLengthVector() {
        Vector3 zeroLengthVector = new Vector3();
        assert vector1.isPerpendicular(zeroLengthVector, 0f) == false;
    }

    @Test
    public void testIsPerpendicularWithSameDirection() {
        Vector3 sameDirectionVector = new Vector3(vector1);
        sameDirectionVector.set(vector2);
        assert !vector1.isPerpendicular(sameDirectionVector, 0f) : "Vectors should not be perpendicular with the same direction";
    }

    @Test
    public void testIsPerpendicularWithOppositeDirection() {
        Vector3 oppositeDirectionVector = new Vector3(-vector2.x, -vector2.y, -vector2.z);
        assert vector1.isPerpendicular(oppositeDirectionVector, 0f) : "Vectors should be perpendicular with the opposite direction";
    }

    @Test
    public void testIsPerpendicularWithZeroLength() {
        Vector3 zeroLengthVector = new Vector3();
        assert vector1.isPerpendicular(zeroLengthVector, 0f) : "Vectors should be perpendicular with a zero length vector";
    }

    @Test
    public void testIsPerpendicularWithNegativeEpsilon() {
        assert vector1.isPerpendicular(vector2, -0.0001f) : "Vectors should be perpendicular with negative epsilon";
    }

    @Test
    public void testIsPerpendicularWithZeroEpsilon() {
        assert vector1.isPerpendicular(vector2, 0f) : "Vectors should be perpendicular with zero epsilon";
    }

    @Test
    public void testIsPerpendicularWithPositiveEpsilon() {
        assert vector1.isPerpendicular(vector2, 0.0001f) : "Vectors should be perpendicular with positive epsilon";
    }
}
