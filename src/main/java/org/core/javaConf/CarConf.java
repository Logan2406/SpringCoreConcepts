package org.core.javaConf;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Car")
public class CarConf implements InitializingBean, DisposableBean {

    //static block
    {
        System.out.println("Bean is created now");
    }

    //Field injection is done through Autowired like this
    //@Autowired
    private EngineConf engineConf;

    /*public CarConf(EngineConf engineConf)
    {
        // This bean is getting injected through constructor only so it is important
        this.engineConf = engineConf;
        System.out.println("Injecting through constructor");
    }*/

    public EngineConf getEngineConf() {
        return engineConf;
    }

    @Autowired
    public void setEngineConf(EngineConf engineConf) {

        //Autowired is used here if you want to inject through the setter method and without constructor
        this.engineConf = engineConf;
        System.out.println("Injecting through Setter");
    }

    public void startCar()
    {
        System.out.println("Car starting....");
        System.out.println("At first we need to start engine........");
        engineConf.startEngine();
        System.out.println("Car started............");
    }


    //Callback after the dependency injection in the initialization step
    @Override
    public void afterPropertiesSet() throws Exception {
            System.out.println("After Property Set function .......");

            //after this method the bean is ready to use
    }

    //Callback just before the bean is getting destroyed by the Spring controller
    @Override
    public void destroy() throws Exception {
        System.out.println("This bean is getting destroyed.... in the Destroy function");
    }
}
