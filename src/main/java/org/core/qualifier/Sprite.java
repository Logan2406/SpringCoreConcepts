package org.core.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("Sprite")
@Primary                   // when getting the bean, the ambiguity will be reduced, by default this primary component will be injected
public class Sprite implements ColdDrink{
    @Override
    public void drink() {
        System.out.println("Drinking Sprite");
    }
}
