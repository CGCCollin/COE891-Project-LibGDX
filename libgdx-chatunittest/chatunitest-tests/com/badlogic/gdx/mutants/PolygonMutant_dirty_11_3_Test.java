package com.badlogic.gdx.mutants;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.badlogic.gdx.math.*;

@ExtendWith(MockitoExtension.class)
public class PolygonMutant_dirty_11_3_Test {

    private PolygonMutant polygon;

    @BeforeEach
    void setUp() {
        polygon = new PolygonMutant();
    }

    @Test
    void testDirty() throws NoSuchFieldException, IllegalAccessException {
        // Arrange
        java.lang.reflect.Field dirtyField = PolygonMutant.class.getDeclaredField("dirty");
        dirtyField.setAccessible(true);
        // Act
        polygon.dirty();
        // Assert
        assertTrue((boolean) dirtyField.get(polygon), "The polygon should be marked as dirty after calling the dirty() method.");
    }

    @Test
    void testDirtyAfterConstructor() throws NoSuchFieldException, IllegalAccessException {
        // Arrange
        PolygonMutant mutant = new PolygonMutant();
        java.lang.reflect.Field dirtyField = PolygonMutant.class.getDeclaredField("dirty");
        dirtyField.setAccessible(true);
        // Act
        // Do nothing, the constructor should automatically mark the polygon as dirty
        // Assert
        assertTrue((boolean) dirtyField.get(mutant), "The polygon should be marked as dirty after calling the constructor.");
    }
}
