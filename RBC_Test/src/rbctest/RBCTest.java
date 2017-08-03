/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbctest;

import rbctest.fruit.Fruit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 *
 * @author Chris
 */
public class RBCTest {

    static final Logger log = Logger.getGlobal();
    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
                
        RBCTest rbcTest = new RBCTest();
        Integer total = rbcTest.run( args );
        
        log.info("Total = "+total);
    }
    
    /*
    Method to handle command line parameters.
    */
    public Integer run(String... args) {
        
        List<Fruit>basket = new ArrayList<>();
        for (String arg : args) {   
            Optional<Fruit> fruit = FruitFactory.getFruit( arg );
            if( fruit.isPresent() ) {
                basket.add( fruit.get() );                    
            }
        }        
        return( sumBasket( basket ));
    }

    public static Integer sumBasket(List<Fruit> basket) {
    
        return basket.stream().mapToInt(n->n.getPrice()).sum();
    }    
    
}
