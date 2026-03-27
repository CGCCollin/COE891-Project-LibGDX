package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.graphics.Color;

public class ColorLerpTestISP {

    private Color color;
	
	@BeforeEach
	public void setup() {
		this.color = new Color();
	}

	@ParameterizedTest (name = "{index}: t={0} | Expected r={1}, g={2}, b={3}, a={4}")
	@CsvSource({"-1, 0, 0, 0, 0",
				" 0, 0, 0, 0, 0",
				"1, 0.5, 0.5, 0.5, 0.5",
				"2, 1, 1, 1, 1",
				})
	void lerpTest(float input_t, float expected_r, float expected_g, float expected_b, float expected_a) {
		System.out.println("--------------- lerpTest: --------------- ");
        color.lerp(0.5f,0.5f, 0.5f, 0.5f, input_t);
		System.out.println("Actual r="+color.r+", g="+color.g+", b="+color.b+", a="+color.a);
		System.out.println("Expected r="+expected_r+", g="+expected_g+", b="+expected_b+", a="+expected_a);
		assertTrue(color.r == expected_r && color.g == expected_g && color.b == expected_b && color.a == expected_a);
	}
}
