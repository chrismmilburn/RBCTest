
package rbctest;

import rbctest.fruit.Lemon;
import rbctest.fruit.Apple;
import rbctest.fruit.Banana;
import rbctest.fruit.Peach;
import rbctest.fruit.Orange;
import rbctest.fruit.Fruit;
import java.util.Optional;

/**
 *
 * @author Chris Milburn
 * Create items of fruit given their name.
 */
public class FruitFactory {

    public static Optional<Fruit> getFruit(String fruitName ){

        if(fruitName.equalsIgnoreCase("Apple")){
            return Optional.of( new Apple() );
        } else if (fruitName.equalsIgnoreCase("Banana")){
            return Optional.of( new Banana());
        } else if (fruitName.equalsIgnoreCase("Lemon")) {
            return Optional.of( new Lemon());
        } else if (fruitName.equalsIgnoreCase("Orange")) {
            return Optional.of( new Orange());
        } else if (fruitName.equalsIgnoreCase("Peach")){
            return Optional.of( new Peach() );                
        } else {
            return Optional.empty();
        }            
    }
}
