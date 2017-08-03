package rbctest;

import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import rbctest.fruit.Fruit;
import rbctest.fruit.Apple;
import rbctest.fruit.Banana;
import rbctest.fruit.Lemon;
import rbctest.fruit.Orange;
import rbctest.fruit.Peach;

/**
 *
 * @author Chris Milburn
 */
public class FruitFactoryTest {
 
    /**
     * Test of getFruit method, of class FruitFactory.
     */
    @Test
    public void testGetApple() {
        String fruitName = "Apple";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertTrue(optResult.get() instanceof Apple );
    }
    @Test
    public void testGetBanana() {
        String fruitName = "Banana";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertTrue(optResult.get() instanceof Banana );
    }
    @Test
    public void testGetOrange() {
        String fruitName = "Orange";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertTrue(optResult.get() instanceof Orange );
    }
        @Test
    public void testGetLemon() {
        String fruitName = "Lemon";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertTrue(optResult.get() instanceof Lemon );
    }
        @Test
    public void testGetPeach() {
        String fruitName = "Peach";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertTrue(optResult.get() instanceof Peach );
    }
    @Test
    public void testGetBadFruit() {
        String fruitName = "Pineapple";
        Optional<Fruit> optResult = FruitFactory.getFruit( fruitName );
        assertFalse( optResult.isPresent() );
    }    
}
