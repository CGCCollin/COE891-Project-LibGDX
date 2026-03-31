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

    // ------------------------------------------------
    // isPointInPolygon(float[] polygon, int offset, int count, float x, float y)
    //
    // Use a simple square:
    // (0,0), (10,0), (10,10), (0,10)
    // ------------------------------------------------

    @Test
    public void testIsPointInPolygon_True_WhenInside() {
        float[] square = {0f, 0f, 10f, 0f, 10f, 10f, 0f, 10f};

        assertTrue(Intersector.isPointInPolygon(square, 0, square.length, 5f, 5f));
    }

    @Test
    public void testIsPointInPolygon_False_WhenOutside() {
        float[] square = {0f, 0f, 10f, 0f, 10f, 10f, 0f, 10f};

        assertFalse(Intersector.isPointInPolygon(square, 0, square.length, 15f, 5f));
    }

    @Test
    public void testIsPointInPolygon_True_ForConcavePolygonInside() {
        // Concave polygon shaped a bit like an arrow / dented quad
        float[] concave = {
            0f, 0f,
            4f, 0f,
            4f, 4f,
            2f, 2f,
            0f, 4f
        };

        assertTrue(Intersector.isPointInPolygon(concave, 0, concave.length, 1f, 1f));
    }

    @Test
    public void testIsPointInPolygon_False_ForConcavePolygonInDent() {
        float[] concave = {
            0f, 0f,
            4f, 0f,
            4f, 4f,
            2f, 2f,
            0f, 4f
        };

        // A point in the "dent" area that should not count as inside
        assertFalse(Intersector.isPointInPolygon(concave, 0, concave.length, 3f, 3f));
    }

    // ------------------------------------------------
    // intersectPolygons(FloatArray polygon1, FloatArray polygon2)
    //
    // Paths:
    // 1) polygon2 point inside polygon1
    // 2) polygon1 point inside polygon2
    // 3) edges intersect
    // 4) separate polygons
    // ------------------------------------------------

    @Test
    public void testIntersectPolygons_True_WhenPolygon2InsidePolygon1() {
        FloatArray outer = new FloatArray(new float[] {
            0f, 0f,
            10f, 0f,
            10f, 10f,
            0f, 10f
        });

        FloatArray inner = new FloatArray(new float[] {
            2f, 2f,
            4f, 2f,
            4f, 4f,
            2f, 4f
        });

        assertTrue(Intersector.intersectPolygons(outer, inner));
    }

    @Test
    public void testIntersectPolygons_True_WhenPolygon1InsidePolygon2() {
        FloatArray inner = new FloatArray(new float[] {
            2f, 2f,
            4f, 2f,
            4f, 4f,
            2f, 4f
        });

        FloatArray outer = new FloatArray(new float[] {
            0f, 0f,
            10f, 0f,
            10f, 10f,
            0f, 10f
        });

        assertTrue(Intersector.intersectPolygons(inner, outer));
    }

    @Test
    public void testIntersectPolygons_True_WhenEdgesCrossButNoVertexContained() {
        FloatArray p1 = new FloatArray(new float[] {
            0f, 0f,
            4f, 0f,
            4f, 4f,
            0f, 4f
        });

        FloatArray p2 = new FloatArray(new float[] {
            2f, -1f,
            6f, -1f,
            6f, 3f,
            2f, 3f
        });

        assertTrue(Intersector.intersectPolygons(p1, p2));
    }

    @Test
    public void testIntersectPolygons_False_WhenSeparate() {
        FloatArray p1 = new FloatArray(new float[] {
            0f, 0f,
            2f, 0f,
            2f, 2f,
            0f, 2f
        });

        FloatArray p2 = new FloatArray(new float[] {
            5f, 5f,
            7f, 5f,
            7f, 7f,
            5f, 7f
        });

        assertFalse(Intersector.intersectPolygons(p1, p2));
    }

    // ------------------------------------------------
    // intersectPlanes(Plane a, Plane b, Plane c, Vector3 intersection)
    //
    // Need:
    // - true case with unique intersection
    // - false case when determinant is ~0 (parallel / dependent planes)
    // ------------------------------------------------

    @Test
    public void testIntersectPlanes_True_WhenThreePlanesMeetAtOnePoint() {
        Plane px = new Plane(new Vector3(1, 0, 0), -1); // x = 1
        Plane py = new Plane(new Vector3(0, 1, 0), -2); // y = 2
        Plane pz = new Plane(new Vector3(0, 0, 1), -3); // z = 3

        Vector3 intersection = new Vector3();

        boolean result = Intersector.intersectPlanes(px, py, pz, intersection);

        assertTrue(result);
        assertEquals(1f, intersection.x, 0.0001f);
        assertEquals(2f, intersection.y, 0.0001f);
        assertEquals(3f, intersection.z, 0.0001f);
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
