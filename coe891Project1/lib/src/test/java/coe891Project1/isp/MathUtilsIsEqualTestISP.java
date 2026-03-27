package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.MathUtils;

public class MathUtilsIsEqualTestISP {

	@ParameterizedTest (name = "{index}: a={0}, b={1}, tolerance={2}| expected value={3}")
	@CsvSource({"0.5f, 0, 1, true",
				"1, 0, 1, true",
				"-2, 0, 1, false"
				})
	void isEqualTest(float input_a, float input_b, float input_tolerance, boolean expected_value) {
		System.out.println("--------------- isEqualTest: --------------- ");
        boolean actual_value = MathUtils.isEqual(input_a, input_b, input_tolerance);
		System.out.println("Actual value="+actual_value);
		System.out.println("Expected value="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}