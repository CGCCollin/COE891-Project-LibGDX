package coe891Project1.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.badlogic.gdx.math.MathUtils;

public class MathUtilsFloorTestISP {

	@ParameterizedTest (name = "{index}: input={0}, expected value={1}")
	@CsvSource({"0.9f, 0",
				"1f, 1",
				"1.1f, 1"
				})
	void floorTest(float input_value, int expected_value) {
		System.out.println("--------------- floorTest: --------------- ");
        int actual_value = MathUtils.floor(input_value);
		System.out.println("Actual value="+actual_value);
		System.out.println("Expected value="+expected_value);
		assertTrue(actual_value == expected_value);
	}
}