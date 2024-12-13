package org.core.concepts;

public class Car {
    //Car need one Engine so Injecting dependency manually here

    Engine engine = new Engine();  //Created and instantiated the dependency

    public void start()
    {
        engine.startEngine();
        System.out.println("........Car started");
    }

}
