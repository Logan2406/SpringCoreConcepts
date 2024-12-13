package org.core.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class First {
    public static int count;

    public First()
    {
        count++;
        System.out.println("First Class is created");
    }
}
