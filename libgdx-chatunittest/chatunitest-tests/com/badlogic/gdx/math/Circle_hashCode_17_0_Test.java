package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Circle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.Serializable;
import com.badlogic.gdx.utils.NumberUtils;

public class Circle_hashCode_17_0_Test {

    @Test
    public void testHashCode() throws Exception {
        // create a new circle instance
        Circle circle = new Circle(1, 2, 3);
        // get the hashCode method using reflection
        Method hashCodeMethod = Circle.class.getDeclaredMethod("hashCode");
        // invoke the hashCode method and store the result
        int hashCodeResult = (int) hashCodeMethod.invoke(circle);
        // create a new circle instance with the same values
        Circle circle2 = new Circle(1, 2, 3);
        // get the hashCode of the second circle instance using reflection and store the result
        Method hashCodeMethod2 = Circle.class.getDeclaredMethod("hashCode");
        int hashCodeResult2 = (int) hashCodeMethod2.invoke(circle2);
        // create a new circle instance with different values
        Circle circle3 = new Circle(4, 5, 6);
        // get the hashCode of the third circle instance using reflection and store the result
        Method hashCodeMethod3 = Circle.class.getDeclaredMethod("hashCode");
        int hashCodeResult3 = (int) hashCodeMethod3.invoke(circle3);
        // check that the hashes are equal for circles with the same values
        assertEquals(hashCodeResult, hashCodeResult2);
        // check that the hashes are different for circles with different values
        assertNotEquals(hashCodeResult, hashCodeResult3);
    }
}
