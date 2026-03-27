package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.MathUtils;

public class MathUtilsClampTestISP {

	@ParameterizedTest (name = "{index}: value={0}, min r={1}, max={2} | expected value={3}")
	@CsvSource({"-1, 0, 10, 0",
				" 5, 0, 10, 5",
				"11, 0, 10, 10"
				})
	void clampTest(int input_value, int input_min, int input_max, int expected_value) {
		System.out.println("--------------- clampTest: --------------- ");
        int actual_value = MathUtils.clamp(input_value, input_min, input_max);
		System.out.println("Actual value="+actual_value);
		System.out.println("Expected value="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}