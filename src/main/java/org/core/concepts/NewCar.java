package org.core.concepts;

public class NewCar {
    Engine engine;

    public NewCar(Engine eng)
    {
        //Dependency injection through constructor
        this.engine = eng;
        System.out.println("Engine has been added");
    }

    public void start()
    {
        System.out.println("Before Staring car we need to star engine");
        this.engine.startEngine();
        System.out.println("Car started");
    }

}
