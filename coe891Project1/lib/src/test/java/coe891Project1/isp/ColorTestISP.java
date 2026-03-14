package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.*;

public class ColorTestISP {
	private Color color;
	
	@BeforeEach
	public void setup() {
		this.color = new Color();
		
	}
	
	/*
		* Below range: < 0.0
		* Input (r,g,b,a) = (-1, -1, -1, -1)
		* Expected (r,g,b,a) = (0, 0, 0, 0)
	*/
	@Test
	public void colorClampNegativeTest() {
		System.out.println("------------------------------ colorClampNegativeTest ------------------------------");
		color.set(-1.0f,-1.0f,-1.0f,-1.0f);
		color.clamp();
		System.out.println("colorClampTest: Below Range < 0.0 | Expected r,g,b,a=0. Actual r="+color.r+", g="+color.g+", b="+color.b+", a="+color.a);
		assertTrue(color.r == 0 && color.g == 0 && color.b == 0 && color.a == 0);
	}

	/*
		* At 0
		* Input (r,g,b,a) = (0, 0, 0, 0)
		* Expected (r,g,b,a) = (0, 0, 0, 0)
	*/
	@Test
	public void colorClampZeroTest() {
		System.out.println("------------------------------ colorClampZeroTest ------------------------------");
		color.set(0,0,-0,0);
		color.clamp();
		System.out.println("colorClampTest: At 0 | Expected r,g,b,a=0. Actual r="+color.r+", g="+color.g+", b="+color.b+", a="+color.a);
		assertTrue(color.r == 0 && color.g == 0 && color.b == 0 && color.a == 0);
	}

	/*
		* In range: [0.0, 1.0]
		* Input (r,g,b,a) = (0.5, 0.5, 0.5, 0.5)
		* Expected (r,g,b,a) = (0.5, 0.5, 0.5, 0.5)
	*/
	@Test
	public void colorClampMidRangeTest() {
		System.out.println("------------------------------ colorClampMidRangeTest ------------------------------");
		color.set(0.5f,0.5f,0.5f,0.5f);
		color.clamp();
		System.out.println("colorClampTest: In Range: [0.0, 1.0] | Expected r,g,b,a=0.5. Actual r="+color.r+", g="+color.g+", b="+color.b+", a="+color.a);
		assertTrue(color.r == 0.5 && color.g == 0.5 && color.b == 0.5 && color.a == 0.5);
	}

	/*
		* Above range: > 1.0
		* Input (r,g,b,a) = (2, 2, 2, 2)
		* Expected (r,g,b,a) = (1, 1, 1, 1)
	*/
	@Test
	public void colorClampAboveOneTest() {
		System.out.println("------------------------------ colorClampAboveOneTest ------------------------------");
		color.set(2,2,2,2);
		color.clamp();
		System.out.println("colorClampTest: Above Range: > 1.0 | Expected r,g,b,a=1. Actual r="+color.r+", g="+color.g+", b="+color.b+", a="+color.a);
		assertTrue(color.r == 1 && color.g == 1 && color.b == 1 && color.a == 1);
	}

}
