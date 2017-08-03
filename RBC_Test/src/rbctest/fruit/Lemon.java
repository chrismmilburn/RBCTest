
package rbctest.fruit;

/**
 *
 * @author Chris Milburn
 */
public class Lemon extends Fruit {
    
    public Lemon( Integer price ){
        this.price = price;
    }
    
    public Lemon() {
        // Setup a default price if none is given.
        this.price = 20;
    }
}
