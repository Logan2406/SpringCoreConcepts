package org.core.javaConf;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("Engine")
public class EngineConf {

    public void startEngine()
    {
        System.out.println("Starting Engine");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("This method is alternative to lifecycle method using @PostConstruct--> afterPropertiesSet()");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("This method is alternative to destroy using @PreDestroy ");
    }
}
