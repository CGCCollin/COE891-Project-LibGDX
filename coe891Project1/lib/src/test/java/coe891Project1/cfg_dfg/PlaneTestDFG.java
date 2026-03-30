package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.*;

public class PlaneTestDFG {
	private Plane plane;
	@BeforeEach
	public void setup() {
		plane = new Plane(new Vector3(0,1,0),0);
	}
	
	@Test
	public void t1_testTestPoint() {
		Assertions.assertTrue(plane.testPoint(0,0,0) == Plane.PlaneSide.OnPlane);
	}
	
	@Test
	public void t2_testTestPoint() {
		Assertions.assertTrue(plane.testPoint(-2,-4,1) == Plane.PlaneSide.Back);
	}
	
	@Test
	public void t3_testTestPoint() {
		Assertions.assertTrue(plane.testPoint(4,6,9) == Plane.PlaneSide.Front);
	}
}
