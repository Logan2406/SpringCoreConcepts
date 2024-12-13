package org.core.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Human")
public class Human {

    @Autowired
    @Qualifier("Sprite") //or use the class name with camel case if the name of the component is not provided
    private ColdDrink coldDrink;

    public void tryColdDrink()
    {
        System.out.println("Trying Cold Drink..................");
        coldDrink.drink();
    }
}
