package org.core.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Coke")
public class Coke implements ColdDrink{
    @Override
    public void drink() {
        System.out.println("Drinking Coke");
    }
}
