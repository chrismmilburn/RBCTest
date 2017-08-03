
package rbctest.fruit;

/**
 *
 * @author Chris Milburn
 */
public class Apple extends Fruit {
    
    public Apple( Integer price ){
        this.price = price;
    }
    public Apple(){
        // No price given so default.
        this.price = 10;
    }    

}
