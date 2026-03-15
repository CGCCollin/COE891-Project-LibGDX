package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.graphics.Color;

public class ColorClampTestISP {
	private Color color;

	@BeforeEach
	public void setup() {
		this.color = new Color();
		
	}
	
	@ParameterizedTest(name = "{index}: input r={0}, g={1}, b={2}, a={3} | Expected r={4}, g={5}, b={6}, a={7}")
	@CsvSource({"-1, -1, -1, -1, 0, 0, 0, 0",
				"-1, 0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f",
				"2, 0.5, 0.5, 0.5, 1, 0.5f, 0.5f, 0.5f",
				"0.5f, -1, 0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f",
				"0.5f, 2, 0.5f, 0.5f, 0.5f, 1, 0.5f, 0.5f",
				"0.5f, 0.5f, -1, 0.5f, 0.5f, 0.5f, 0, 0.5f",
				"0.5f, 0.5f, 2, 0.5f, 0.5f, 0.5f, 1, 0.5f",
				"0.5f, 0.5f, 0.5f, -1, 0.5f, 0.5f, 0.5f, 0",
				"0.5f, 0.5f, 0.5f, 2, 0.5f, 0.5f, 0.5f, 1",
				"0, 0, 0, 0, 0, 0, 0, 0",
				"1, 1, 1, 1, 1, 1, 1, 1",
				"2, 2, 2, 2, 1, 1, 1, 1",
				})
	void clampTest(float input_r, float input_g, float input_b, float input_a, float expected_r, float expected_b, float expected_g, float expected_a) {
		color.set(input_r, input_b, input_g, input_a);
		color.clamp();
		System.out.println("--------------- clampTest: --------------- ");
		System.out.println("Actual r="+color.r+", b="+color.b+", g="+color.g+", a="+color.a);
		System.out.println("Expected r="+expected_r+", b="+expected_b+", g="+expected_g+", a="+ expected_a);
		assertTrue(color.r == expected_r && color.b == expected_b && color.g == expected_g && color.a == expected_a);
	}


}
