package org.core.usingIOC;

public class CarIOC {
    EngineIOC eng;


    public CarIOC(EngineIOC eng)
    {
        this.eng = eng;
        System.out.println("Setting through Constructor");
    }
    public EngineIOC getEng() {
        return eng;
    }

    public void setEng(EngineIOC eng) {
        this.eng = eng;
        System.out.println("Setting through setter");
    }

    public void startCar()
    {
        System.out.println("Car starting....");
        System.out.println("At first we need to start engine........");
        eng.startEngine();
        System.out.println("Car started............");

    }
}
