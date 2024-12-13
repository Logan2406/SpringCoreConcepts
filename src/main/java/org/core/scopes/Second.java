package org.core.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Second {

    private Third third;

    public Second()
    {
        System.out.println("Creating second bean--");
    }

    @Autowired
    public Second(Third third)
    {
        this.third = third;
        System.out.println("Setting third class bean in second bean----");
    }

    public void runSecond()
    {
        System.out.println("Just using Second bean");
        System.out.println("Class Third :"+third.toString());
    }

}
