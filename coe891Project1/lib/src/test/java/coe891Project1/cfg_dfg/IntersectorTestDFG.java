package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.*;

public class IntersectorTestDFG {
	private Plane plane;
	private Vector3 intersection;
	
	@BeforeEach
	public void setup() {
		plane = new Plane(new Vector3(0,1,0), 1);
		intersection = new Vector3(0,0,0);
	}
	
	@Test
	public void t1_intersectSegmentPlane() {
		Vector3 start = new Vector3(0,0,0);
		Vector3 end = new Vector3(0,0,0);
		Assertions.assertFalse(Intersector.intersectSegmentPlane(start, end, plane, intersection));
	}
	
	@Test
	public void t2_intersectSegmentPlane() {
		Vector3 start = new Vector3(0,1,3);
		Vector3 end = new Vector3(0,2,3);
		Assertions.assertFalse(Intersector.intersectSegmentPlane(start, end, plane, intersection));
	}
	
	@Test
	public void t3_intersectSegmentPlane() {
		Vector3 start = new Vector3(0,-1,3);
		Vector3 end = new Vector3(1,3,3);
		Assertions.assertTrue(Intersector.intersectSegmentPlane(start, end, plane, intersection));
	}
	
	@Test
	public void t1_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,1,0);
		Vector3 direction = new Vector3 (0,1,0);
		Ray ray = new Ray(origin, direction);
		Assertions.assertFalse(Intersector.intersectRayPlane(ray, plane, null));
	}
	
	@Test
	public void t2_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,0,0);
		Vector3 direction = new Vector3 (0,0,0);
		Ray ray = new Ray(origin, direction);
		Assertions.assertFalse(Intersector.intersectRayPlane(ray, plane, null));
	}
	
	@Test
	public void t3_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,-1,0);
		Vector3 direction = new Vector3 (0,1,0);
		Ray ray = new Ray(origin, direction);
		Assertions.assertTrue(Intersector.intersectRayPlane(ray, plane, null));
	}
	
	@Test
	public void t4_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,-1,0);
		Vector3 direction = new Vector3 (0,1,0);
		Ray ray = new Ray(origin, direction);
		Assertions.assertTrue(Intersector.intersectRayPlane(ray, plane, intersection));
	}
	
	@Test
	public void t5_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,0,0);
		Vector3 direction = new Vector3 (0,0,0);
		Ray ray = new Ray(origin, direction);
		plane = new Plane(new Vector3(0,1,0), 0);
		Assertions.assertTrue(Intersector.intersectRayPlane(ray, plane, null));
	}
	
	@Test
	public void t6_intersectRayPlane() {
		Vector3 origin = new Vector3 (0,-1,0);
		Vector3 direction = new Vector3 (0,1,0);
		Ray ray = new Ray(origin, direction);
		plane = new Plane(new Vector3(0,1,0), 0);
		intersection = new Vector3(1,1,1);
		Assertions.assertTrue(Intersector.intersectRayPlane(ray, plane, intersection));
	}
	
	
}
