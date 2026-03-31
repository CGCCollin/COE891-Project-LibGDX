package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Polyline;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.*;

public class PolylineTestCFG {
	@BeforeEach
	public void setup() {
		
	}
	
	@Test
	public void t1_testGetScaledLength() {
		Polyline pl = new Polyline(new float[] {1,1,0,1,0,0});
		Assertions.assertEquals(pl.getScaledLength(),2);
	}
	
	@Test
	public void t2_testGetScaledLength() {
		Polyline pl = new Polyline(new float[] {1,1,0,1,0,0});
		pl.getScaledLength();//run once
		Assertions.assertEquals(pl.getScaledLength(),2);//run second time to achieve path 1,2
	}
	
	@Test
	public void t3_testGetScaledLength() {
		Polyline pl = new Polyline();
		Assertions.assertEquals(pl.getScaledLength(),0);
	}
	
	@Test
	public void t1_test_getBoundingRectangle() {
		Polyline pl = new Polyline(new float[] {1,1,1,1});
		Rectangle rt = new Rectangle(1,1,0,0);
		Assertions.assertEquals(rt, pl.getBoundingRectangle());
	}
	
	@Test
	public void t2_test_getBoundingRectangle() {
		Polyline pl = new Polyline(new float[] {1,1,0,0});
		Rectangle rt = new Rectangle(0,0,1,1);
		Assertions.assertEquals(rt, pl.getBoundingRectangle());
	}
	
	@Test
	public void t3_test_getBoundingRectangle() {
		Polyline pl = new Polyline(new float[] {0,0,1,1});
		Rectangle rt = new Rectangle(0,0,1,1);
		Assertions.assertEquals(rt, pl.getBoundingRectangle());
	}
	
	@Test
	public void t4_test_getBoundingRectangle() {
		Polyline pl = new Polyline(new float[] {0,0,-1,1,1,-1,0,0});
		Rectangle rt = new Rectangle(-1,-1,2,2);
		Assertions.assertEquals(rt, pl.getBoundingRectangle());
	}
	
	@Test
	public void t5_test_getBoundingRectangle() {
		Polyline pl = new Polyline(new float[] {1,1,1,1});
		Rectangle rt = new Rectangle(1,1,0,0);
		pl.getBoundingRectangle();//now bounds exists
		Assertions.assertEquals(rt, pl.getBoundingRectangle());
	}
}
