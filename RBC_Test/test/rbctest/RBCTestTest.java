
package rbctest;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rbctest.fruit.Apple;
import rbctest.fruit.Banana;
import rbctest.fruit.Fruit;
import rbctest.fruit.Lemon;
import rbctest.fruit.Orange;
import rbctest.fruit.Peach;

/**
 *
 * @author Chris
 */
public class RBCTestTest {


    /**
     * Test of sumBasket method, of class RBCTest.
     */
    
    @Test
    public void testDefaultPricesSumBasket() {        
        List<Fruit> basket = new ArrayList<>();
        basket.add( new Apple() );
        basket.add( new Orange() );
        basket.add( new Banana() );
        basket.add( new Lemon() );
        basket.add( new Peach() );
        Integer expResult = 91;
        Integer result = RBCTest.sumBasket(basket);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumBasket() {        
        List<Fruit> basket = new ArrayList<>();
        basket.add( new Apple(20) );
        basket.add( new Orange(20) );
        basket.add( new Banana(20) );
        basket.add( new Apple(20) );
        basket.add( new Lemon(12) );
        basket.add( new Peach(24) );
        Integer expResult = 116;
        Integer result = RBCTest.sumBasket(basket);
        assertEquals(expResult, result);
    }    

    /**
     * Test of run method, of class RBCTest.
     */
    @Test
    public void testRun() {
      
        String[] args = {"Apple", "Banana"};
        RBCTest instance = new RBCTest();
        Integer expResult = 35;
        Integer result = instance.run(args);
        assertEquals(expResult, result);

    }
}
