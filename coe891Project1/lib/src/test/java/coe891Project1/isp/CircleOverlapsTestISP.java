package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.Circle;

public class CircleOverlapsTestISP {
	private Circle circle1 = new Circle(0,0,3); // unit circle

	@ParameterizedTest (name = "{index}: x={4} , y={5}, radius={6} | expected={7}")
	@CsvSource({"0, 0, 1f, true",
				"4, 0, 2, true",
				"5, 5, 1, false"
				})
	void containsTest(float input_x, float input_y, float input_radius, boolean expected_value) {
		System.out.println("--------------- containsTest: --------------- ");
        Circle circle2 = new Circle(input_x,input_y, input_radius); // unit circle
        boolean actual_value = circle2.overlaps(circle1);

		System.out.println("Actual value x="+actual_value);
		System.out.println("Expected value x="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}