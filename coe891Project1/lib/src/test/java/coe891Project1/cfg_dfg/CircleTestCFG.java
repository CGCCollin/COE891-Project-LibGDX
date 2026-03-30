package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.*;

public class CircleTestCFG {
	private Circle c;
	
	@BeforeEach
	public void setup() {
		
	}
	
	@AfterEach
	public void teardown() {
		
	}
	
	@Test
	public void t1_testEquals() {
		Circle c1 = new Circle(1, -1, 4);
        Circle c2 = c1;
        Assertions.assertTrue(c1.equals(c2));
	}

    @Test
    public void t2_testEquals(){
    	Circle c1 = new Circle(1, -1, 4);
        Circle c2 = null;
        Assertions.assertFalse(c1.equals(c2));
    }

    @Test void t3_testEquals(){
        Circle c1 = new Circle(1, -1, 4);
        Circle c2 = new Circle(1, -1, 4);
        Assertions.assertTrue(c1.equals(c2));
    }



}