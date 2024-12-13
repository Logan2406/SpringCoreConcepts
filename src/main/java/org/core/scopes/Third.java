package org.core.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Third {
    public Third()
    {
        System.out.println("Just checking Third--------");
    }
}
