package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.graphics.Color;
public class ColorFromHsvTestISP {
    private Color color;
	
	@BeforeEach
	public void setup() {
		this.color = new Color();
		
	}

	@ParameterizedTest(name = "{index}: input h={0}, s={1}, v={2} | Expected r={4}, g={5}, b={6}")
	@CsvSource({"0, 0, 0, 0, 0, 0", 
				"360, 1, 1, 1, 0, 0",
				"361, 0.5f, 0.5f, 0.5, 0.25, 0.2541666",
				"-1, 0.5f, 0.5f, 0.5, 0.25416672, 0.25",
				"180, 2, 0.5f, 0, 0.5f, 0.5f",
				"180, -1, 0.5f, 1, 0.5, 0.5",
				"180, 0.5, 2, 1, 1, 1",
				"180, 0.5, -1, 0, 0, 0",
				"-1, -1, 0.5, 0.5, 0.99166656, 1",
				"180, -1, -1, 0, 0, 0",
				"-1, 0.5, -1, 0, 0, 0",
				"-1, -1, -1, 0, 0, 0",
				"361, 2, 2, 1, 0, 0"
				})
				
	void fromHsvTest(float input_h, float input_s, float input_v, float expected_r, float expected_b, float expected_g) {
		color.fromHsv(input_h, input_s, input_v);
		System.out.println("--------------- fromHsvTest: --------------- ");
		System.out.println("Actual r="+color.r+", b="+color.b+", g="+color.g);
		System.out.println("Expected r="+expected_r+", b="+expected_b+", g="+expected_g);
		assertTrue(color.r == expected_r && color.b == expected_b && color.g == expected_g);
	}
}
