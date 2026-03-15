/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe891Project1.mutation_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author matthewhvizdos
 */
public class RectangleTestMutation {
    private Rectangle rect = null;
    private Vector2 pos = null;
    
    @BeforeEach
    public void before() {
        rect = null;
        pos  = null;
    }
    
    /* Testing the getPosition(Vector2 position) functions */
    
    @Test
    public void positionSetCorrectlyTest() {
        rect = new Rectangle(1, 2, 3, 4);
        pos = new Vector2(0, 0);
    
        rect.getPosition(pos);
        
        assertEquals(1f, pos.x, 0.0001);
        assertEquals(2f, pos.y, 0.0001);
    }
    
    @Test
    public void returnSameVectorTest() {
        rect = new Rectangle(1, 2, 3, 4);
        pos = new Vector2(0, 0);
        
        Vector2 res = rect.getPosition(pos);
        assertSame(pos, res);
    }
    
    @Test
    public void getPositionOverwritesOriginalTest() {
        rect = new Rectangle(1, 2, 3, 4);
        pos  = new Vector2(5, 6);
        
        rect.getPosition(pos);
        
        assertEquals(5f, pos.x, 0.0001);
        assertEquals(6f, pos.y, 0.0001);
    }
}
