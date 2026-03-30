package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.*;


public class PolygonTestDFG {

	@BeforeEach
	public void setup() {
		
	}

	@Test()
	public void t1_testSetVertex() {
		Polygon polygon = new Polygon(new float[] {2,3,4,5,0,0});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
				polygon.setVertex(3, 1, 2);
			}
		);
	}
	
	@Test
	public void t2_testSetVertex() {
		Polygon polygon = new Polygon(new float[] {2,3,4,5,0,0,1,1});
		polygon.setVertex(3, 1, 2);
		float[] vertices = polygon.getVertices();
		Assertions.assertTrue(1 == vertices[6]);
		Assertions.assertTrue(2 == vertices[7]);
	}
	
	@Test public void t1_contains() {
		Polygon polygon = new Polygon();
		Assertions.assertFalse(polygon.contains(0,0));
		
	}
	
	@Test
	public void t2_contains() {
		Polygon polygon = new Polygon(new float[] {0,1,0,1,0,1});
		Assertions.assertFalse(polygon.contains(0,0));
	}
	
	@Test
	public void t3_contains() {
		Polygon polygon = new Polygon(new float[] {-1,1,1,1,1,0,-1,0});
		Assertions.assertTrue(polygon.contains(0,0));
	}
}
