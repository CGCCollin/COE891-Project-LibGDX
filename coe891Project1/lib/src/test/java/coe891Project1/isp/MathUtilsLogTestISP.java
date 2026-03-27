package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.MathUtils;

public class MathUtilsLogTestISP {

	@ParameterizedTest (name = "{index}: a={4}, value={5}, expected value={6}")
	@CsvSource({"10f, 0f, -Infinity",
				"10f, 0.1f, -1f",
				"10f, 100, 2f",
				})
	void logTest(float input_a, float input_value, float expected_value) {
		System.out.println("--------------- logTest: --------------- ");
        float actual_value = MathUtils.log(input_a, input_value);
		System.out.println("Actual value="+actual_value);
		System.out.println("Expected value="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}