package com.badlogic.gdx.mutants;

import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.badlogic.gdx.math.*;
import java.io.Serializable;

public class GridPoint2Mutant_add_6_0_Test {

    @Test
    void add() throws Exception {
        // Arrange
        Class<?> clazz = Class.forName("com.badlogic.gdx.mutants.GridPoint2Mutant");
        Object gridPoint2Mutant1 = clazz.getConstructor(int.class, int.class).newInstance(3, 4);
        Object gridPoint2Mutant2 = clazz.getConstructor(int.class, int.class).newInstance(5, 6);
        // Act
        Method addMethod = clazz.getMethod("add", GridPoint2Mutant.class);
        addMethod.invoke(gridPoint2Mutant1, gridPoint2Mutant2);
        // Assert
        assert ((int) clazz.getField("x").get(gridPoint2Mutant1)) == 8;
        assert ((int) clazz.getField("y").get(gridPoint2Mutant1)) == 10;
    }

    @Test
    void emptyConstructor() throws Exception {
        // Arrange
        Class<?> clazz = Class.forName("com.badlogic.gdx.mutants.GridPoint2Mutant");
        Object gridPoint2Mutant1 = clazz.getDeclaredConstructor().newInstance();
        // Act
        Method setXMethod = clazz.getMethod("set", int.class, int.class);
        setXMethod.invoke(gridPoint2Mutant1, 3, 4);
        // Assert
        assert ((int) clazz.getField("x").get(gridPoint2Mutant1)) == 3;
        assert ((int) clazz.getField("y").get(gridPoint2Mutant1)) == 4;
    }

    @Test
    void copyConstructor() throws Exception {
        // Arrange
        Class<?> clazz = Class.forName("com.badlogic.gdx.mutants.GridPoint2Mutant");
        Object gridPoint2Mutant1 = clazz.getConstructor(int.class, int.class).newInstance(3, 4);
        // Act
        Object gridPoint2Mutant2 = clazz.getDeclaredConstructor(clazz).newInstance(gridPoint2Mutant1);
        // Assert
        assert ((int) clazz.getField("x").get(gridPoint2Mutant2)) == 3;
        assert ((int) clazz.getField("y").get(gridPoint2Mutant2)) == 4;
    }

    @Test
    void setter() throws Exception {
        // Arrange
        Class<?> clazz = Class.forName("com.badlogic.gdx.mutants.GridPoint2Mutant");
        Object gridPoint2Mutant1 = clazz.getDeclaredConstructor().newInstance();
        // Act
        Method setXMethod = clazz.getMethod("set", int.class, int.class);
        setXMethod.invoke(gridPoint2Mutant1, 3, 4);
        // Assert
        assert ((int) clazz.getField("x").get(gridPoint2Mutant1)) == 3;
        assert ((int) clazz.getField("y").get(gridPoint2Mutant1)) == 4;
    }
}
