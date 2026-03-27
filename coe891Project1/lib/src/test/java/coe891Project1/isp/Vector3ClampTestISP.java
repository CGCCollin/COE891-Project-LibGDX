package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.Vector3;

public class Vector3ClampTestISP {

	private Vector3 vector;

	@BeforeEach
	public void setup() {
		this.vector = new Vector3(1,1,1); //length = 1.73
		
	}
	@ParameterizedTest (name = "{index}: min={0} , max={1} | expected x={2}, y={3}, z={4}")
	@CsvSource({"0f, 1f, 0.57735026f, 0.57735026f, 0.57735026f",
				"0f, 2f, 1f, 1f, 1f",
				"2f, 3f, 1.1547005f, 1.1547005f, 1.1547005f"
				})
	void clampTest(float input_min, float input_max, float expected_x, float expected_y, float expected_z) {
		System.out.println("--------------- clampTest: --------------- ");
        vector.clamp(input_min, input_max);

		System.out.println("Actual value x="+vector.x+", y="+vector.y+", z="+vector.z);
		System.out.println("Expected value x="+expected_x+", y="+expected_y+", z="+expected_z);
		assertTrue(vector.x == expected_x && vector.y == expected_y && vector.z == expected_z);
	}
}