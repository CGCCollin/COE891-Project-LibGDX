package coe891Project1.logicTesting;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.FloatArray;

public class IntersectorTestLogic {
	@Test
    public void testIntersectPolygons_True_WhenPolygon2InsidePolygon1() {
        FloatArray outer = new FloatArray(new float[] {
            0, 0,
            10, 0,
            10, 10,
            0, 10
        });

        FloatArray inner = new FloatArray(new float[] {
            2, 2,
            4, 2,
            4, 4,
            2, 4
        });

        assertTrue(Intersector.intersectPolygons(outer, inner));
    }

    @Test
    public void testIntersectPolygons_True_WhenPolygon1InsidePolygon2() {
        FloatArray inner = new FloatArray(new float[] {
            2, 2,
            4, 2,
            4, 4,
            2, 4
        });

        FloatArray outer = new FloatArray(new float[] {
            0, 0,
            10, 0,
            10, 10,
            0, 10
        });

        assertTrue(Intersector.intersectPolygons(inner, outer));
    }

    @Test
    public void testIntersectPolygons_True_WhenEdgesCrossButNoVertexContained() {
        FloatArray p1 = new FloatArray(new float[] {
            0, 0,
            4, 0,
            4, 4,
            0, 4
        });

        FloatArray p2 = new FloatArray(new float[] {
            2, -1,
            6, -1,
            6, 3,
            2, 3
        });

        assertTrue(Intersector.intersectPolygons(p1, p2));
    }

    @Test
    public void testIntersectPolygons_False_WhenSeparate() {
        FloatArray p1 = new FloatArray(new float[] {
            0, 0,
            2, 0,
            2, 2,
            0, 2
        });

        FloatArray p2 = new FloatArray(new float[] {
            5, 5,
            9, 5,
            9, 9,
            5, 9
        });

        assertFalse(Intersector.intersectPolygons(p1, p2));
    }

    @Test
    public void testIntersectPlanes_True_WhenThreePlanesMeetAtOnePoint() {
        Plane px = new Plane(new Vector3(1, 0, 0), -1); // x = 1
        Plane py = new Plane(new Vector3(0, 1, 0), -2); // y = 2
        Plane pz = new Plane(new Vector3(0, 0, 1), -3); // z = 3

        Vector3 intersection = new Vector3();

        boolean result = Intersector.intersectPlanes(px, py, pz, intersection);

        assertTrue(result);
        
        //Double check result
        assertEquals(1, intersection.x, 0.0001f);
        assertEquals(2, intersection.y, 0.0001f);
        assertEquals(3, intersection.z, 0.0001f);
    }

    @Test
    public void testIntersectPlanes_False_WhenPlanesDoNotHaveUniqueIntersection() {
        Plane p1 = new Plane(new Vector3(1, 0, 0), -1); // x = 1
        Plane p2 = new Plane(new Vector3(1, 0, 0), -2); // x = 2 (parallel to p1)
        Plane p3 = new Plane(new Vector3(0, 1, 0), -3); // y = 3

        Vector3 intersection = new Vector3();

        boolean result = Intersector.intersectPlanes(p1, p2, p3, intersection);

        assertFalse(result);
    }
}
