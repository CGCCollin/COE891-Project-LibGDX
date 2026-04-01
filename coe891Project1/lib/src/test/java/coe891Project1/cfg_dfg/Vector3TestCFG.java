package coe891Project1.cfg_dfg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.utils.GdxRuntimeException;
import coe891Project1.Vector3;
import com.badlogic.gdx.*;
public class Vector3TestCFG {
	@BeforeEach
	public void setup() {
		
	}
	
	
	@Test
	@Disabled
	public void t1_fromString() {
		Vector3 v = new Vector3();
		Assertions.assertThrows(GdxRuntimeException.class, () ->{
			v.fromString("");
		});
	}
	@Disabled
	@Test
	public void t2_fromString() {
		Vector3 v = new Vector3();
		Assertions.assertThrows(GdxRuntimeException.class, () ->{
			v.fromString("(a,b,c)");
		});
	}
	@Disabled
	@Test
	public void t3_fromString() {
		Vector3 v = new Vector3();
		Vector3 out = v.fromString("(1,2,3)");
		Assertions.assertTrue(out.x==1 && out.y==2 && out.z==3);

	}
	
	
	@Test public void t1_clamp() {
		Vector3 v = new Vector3(0,0,0);
		Vector3 out = v.clamp(0, 2);
		Assertions.assertEquals(out, new Vector3(0,0,0));
	}
	
	@Test public void t2_clamp() {
		Vector3 v = new Vector3(3,1,3);
		Vector3 out = v.clamp(0, 2);
		Assertions.assertEquals(out, new Vector3(3*(float)Math.sqrt((double)4/19),
				(float)Math.sqrt((double)4/19), 3*(float)Math.sqrt((double)4/19)));
	}
	
	@Test public void t3_clamp() {
		Vector3 v = new Vector3(1,1,1);
		Vector3 out = v.clamp(2, 5);
		Assertions.assertEquals(out, new Vector3((float)Math.sqrt((double)4/3),
				(float)Math.sqrt((double)4/3), (float)Math.sqrt((double)4/3)));
	}
	
	@Test public void t4_clamp() {
		Vector3 v = new Vector3(1,-3,2);
		Vector3 out = v.clamp(2, 5);
		Assertions.assertEquals(out, new Vector3(1,-3,2));
	}
}
