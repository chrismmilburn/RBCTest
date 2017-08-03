
package rbctest.fruit;

/**
 *
 * @author Chris Milburn
 */
public class Orange extends Fruit {
    
    public Orange( Integer price ){
        this.price = price;
    }

    public Orange() {
        // Setup a default price if none is given.
        this.price = 9;
    }
}
