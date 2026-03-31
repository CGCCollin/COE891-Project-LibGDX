/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import coe891Project1.mutants.PolygonMutant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author matthewhvizdos
 */
public class PolygonTestMutation {
    
    public PolygonTestMutation() {
    }
    
    /* set vertex */
    
    @Test
    void setVertexUpdatesCoordinates() {
        PolygonMutant p = new PolygonMutant(new float[]{0,0, 1,1, 2,2});

        p.setVertex(1, 5, 6);

        float[] vertices = p.getVertices();
        assertEquals(5, vertices[2]);
        assertEquals(6, vertices[3]);
    }

    @Test
    void setVertexFirstVertex() {
        PolygonMutant p = new PolygonMutant(new float[]{0,0, 1,1, 2,2});

        p.setVertex(0, 10, 20);

        float[] vertices = p.getVertices();
        assertEquals(10, vertices[0]);
        assertEquals(20, vertices[1]);
    }

    @Test
    void setVertexLastVertex() {
        PolygonMutant p = new PolygonMutant(new float[]{0,0, 1,1, 2,2});

        p.setVertex(2, 7, 8);

        float[] vertices = p.getVertices();
        assertEquals(7, vertices[4]);
        assertEquals(8, vertices[5]);
    }

    @Test
    void setVertexNegativeIndexThrows() {
        PolygonMutant p = new PolygonMutant(new float[]{0,0, 1,1, 2,2});

        assertThrows(IllegalArgumentException.class, () -> {
            p.setVertex(-1, 0, 0);
        });
    }

    @Test
    void setVertexOutOfBoundsThrows() {
        PolygonMutant p = new PolygonMutant(new float[]{0,0, 1,1, 2,2});

        assertThrows(IllegalArgumentException.class, () -> {
            p.setVertex(3, 0, 0);
        });
    }

    /* contains */
    
    @Test
    void pointInsideTriangle() {
        PolygonMutant p = new PolygonMutant(new float[]{
            0,0,
            10,0,
            0,10
        });

        assertTrue(p.contains(2,2));
    }

    @Test
    void pointOutsideTriangle() {
        PolygonMutant p = new PolygonMutant(new float[]{
            0,0,
            10,0,
            0,10
        });

        assertFalse(p.contains(10,10));
    }
    
    @Test
    void concavePolygonInsideOutside() {
        PolygonMutant p = new PolygonMutant(new float[]{
            0,0,
            10,0,
            10,10,
            5,5,
            0,10
        });

        assertTrue(p.contains(3,3));   
        assertTrue(p.contains(7,6));  
    }
    
    @Test
    void wrapAroundEdgeCheck() {
        PolygonMutant p = new PolygonMutant(new float[]{
            0,0,
            10,0,
            10,10,
            0,10
        });

        assertTrue(p.contains(5,5));    
        assertFalse(p.contains(-1,5)); 
    }
    
}
