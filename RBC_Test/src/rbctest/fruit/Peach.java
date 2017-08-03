
package rbctest.fruit;

/**
 *
 * @author Chris Milburn
 */
public class Peach extends Fruit {
    
    public Peach( Integer price ){
        this.price = price;
    }
    public Peach() {
        // Setup a default price if none is given.        
        this.price = 27;
    }
}
