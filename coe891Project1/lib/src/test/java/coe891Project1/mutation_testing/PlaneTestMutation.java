/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import coe891Project1.mutants.PlaneMutant;
import coe891Project1.mutants.PlaneMutant.PlaneSide;
import com.badlogic.gdx.math.Vector3;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test cases to run mutation tests with
 * @author matthewhvizdos
 */
public class PlaneTestMutation {
    private PlaneMutant   plane  = null;
    private Vector3 point1 = null;
    private Vector3 point2 = null;
    private Vector3 point3 = null;
    
    @BeforeEach
    public void before() {
        plane  = new PlaneMutant();
        point1 = null;
        point2 = null;
        point3 = null;
    }
    
    /* Testing the set(Vector3 point1, Vector3 point2, Vector3 point3) function */
    
    @Test
    public void xyPlaneTest() {
        point1 = new Vector3(0, 0, 5);
        point2 = new Vector3(1, 0, 5);
        point3 = new Vector3(0, 1, 5);
        
        plane.set(point1, point2, point3);
        
        assertEquals(0f, plane.distance(point1), 0.0001);
        assertEquals(0f, plane.distance(point2), 0.0001);
        assertEquals(0f, plane.distance(point3), 0.0001);
    }
    
     @Test
    public void xzPlaneTest() {
        point1 = new Vector3(0, 5, 0);
        point2 = new Vector3(1, 5, 0);
        point3 = new Vector3(0, 5, 1);
        
        plane.set(point1, point2, point3);
        
        assertEquals(0f, plane.distance(point1), 0.0001);
        assertEquals(0f, plane.distance(point2), 0.0001);
        assertEquals(0f, plane.distance(point3), 0.0001);
    }
    
     @Test
    public void yzPlaneTest() {
        point1 = new Vector3(5, 0, 0);
        point2 = new Vector3(5, 0, 1);
        point3 = new Vector3(5, 1, 0);
        
        plane.set(point1, point2, point3);
        
        assertEquals(0f, plane.distance(point1), 0.0001);
        assertEquals(0f, plane.distance(point2), 0.0001);
        assertEquals(0f, plane.distance(point3), 0.0001);
    }
    
    @Test
    public void normalizationTest() {
        point1 = new Vector3(0, 0, 0);
        point2 = new Vector3(2, 0, 0);
        point3 = new Vector3(0, 2, 0);
        
        plane.set(point1, point2, point3);
        
        assertEquals(1f, plane.getNormal().len(), 0.0001);
    }
    
    @Test
    public void pointNotOnPlaneTest() {
        point1 = new Vector3(1, 1, 5);
        point2 = new Vector3(2, 0, 4);
        point3 = new Vector3(3, 3, 3);
    
        plane.set(point1, point2, point3);
        
        assertNotEquals(0f, plane.distance(new Vector3(0,0,0)), 0.0001);
    
    }
    
    // test point func:
    
    @Test
    public void pointOnPlaneTest() {
        plane = new PlaneMutant(new Vector3(0,0,1), 0);

        PlaneSide result = plane.testPoint(0,0,0);

        assertEquals(PlaneSide.OnPlane, result);
    }

    @Test
    public void pointInFrontOfPlaneTest() {
        plane = new PlaneMutant(new Vector3(0,0,1), 0);

        PlaneSide result = plane.testPoint(0,0,5);

        assertEquals(PlaneSide.Front, result);
    }

    @Test
    public void pointBehindPlaneTest() {
        plane = new PlaneMutant(new Vector3(0,0,1), 0);

        PlaneSide result = plane.testPoint(0,0,-5);

        assertEquals(PlaneSide.Back, result);
    }

    @Test
    public void nonAxisPlaneFrontTest() {
        plane = new PlaneMutant(new Vector3(1,1,1), 0);

        PlaneSide result = plane.testPoint(5,5,5);

        assertEquals(PlaneSide.Front, result);
    }

    @Test
    public void nonAxisPlaneBackTest() {
        plane = new PlaneMutant(new Vector3(1,1,1), 0);

        PlaneSide result = plane.testPoint(-5,-5,-5);

        assertEquals(PlaneSide.Back, result);
    }
    
}
