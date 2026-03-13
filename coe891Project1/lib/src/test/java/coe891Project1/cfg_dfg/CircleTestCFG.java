package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.*;

public class CircleTestCFG {
	private Circle c;
	
	@BeforeEach
	public void setup() {
		this.c = new Circle(0,0,4);
		
	}
	
	@AfterEach
	public void teardown() {
		
	}
	
	@Test
	public void testEquals() {
		System.out.println("hello");
	}
}
