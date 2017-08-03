
package rbctest.fruit;

/**
 *
 * @author Chris Milburn
 */
public class Banana extends Fruit {
   
    public Banana( Integer price ){
        this.price = price;
    }  
    public Banana() {
        // Setup a default price if none is given.
        this.price = 25;
    }
}
