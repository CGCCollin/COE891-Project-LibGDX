package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.Polygon;

public class PolygonContainsTestISP {
    private float testVertices[] = { 0, 0, 1, 0, 1, 1, 0, 1 }; // unit square
	private Polygon polygon = new Polygon(testVertices);

	@ParameterizedTest (name = "{index}: x={4} , y={5} | expected x={6}")
	@CsvSource({"0.5f, 0.5f, true",
				"0f, 0f, true",
				"2f, 2f, false"
				})
	void containsTest(float input_x, float input_y, boolean expected_value) {
		System.out.println("--------------- containsTest: --------------- ");
        boolean actual_value = polygon.contains(input_x, input_y);

		System.out.println("Actual value x="+actual_value);
		System.out.println("Expected value x="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}