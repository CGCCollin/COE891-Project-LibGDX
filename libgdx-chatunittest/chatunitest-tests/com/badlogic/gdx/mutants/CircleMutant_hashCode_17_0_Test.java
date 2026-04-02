package com.badlogic.gdx.mutants;

import java.lang.reflect.*;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class CircleMutant_hashCode_17_0_Test {

    @Test
    void testHashCode() throws Exception {
        CircleMutant circle1 = new CircleMutant(1, 2, 3);
        CircleMutant circle2 = new CircleMutant(4, 5, 6);
        Method method = CircleMutant.class.getDeclaredMethod("hashCode");
        method.setAccessible(true);
        int hashCode1 = (int) method.invoke(circle1);
        int hashCode2 = (int) method.invoke(circle2);
        assertNotEquals(hashCode1, hashCode2);
    }
}
