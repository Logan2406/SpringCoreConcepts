package org.core;

import org.core.Utils.DemoUtil;
import org.core.concepts.Car;
import org.core.concepts.Engine;
import org.core.concepts.NewCar;
import org.core.javaConf.CarConf;
import org.core.qualifier.Human;
import org.core.scopes.First;
import org.core.scopes.Second;
import org.core.usingIOC.CarIOC;
import org.core.usingIOC.EngineIOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

    public static void xmlConf()
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
        /*

            EngineIOC engine = app.getBean("engine", EngineIOC.class);
            engine.startEngine();

         */

        CarIOC car = app.getBean("car", CarIOC.class);
        car.startCar();

    }

    public static void javaConf()
    {
            //two ways
            //Annotation based context
            ApplicationContext app = new AnnotationConfigApplicationContext(ConfigClass.class);



            //provide the details in xml file
            //ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");


            CarConf car = app.getBean("Car", CarConf.class);
            car.startCar();

            DemoUtil util = app.getBean("util", DemoUtil.class);
            util.showUtil();


            ((ConfigurableApplicationContext)app).close();  // we are closing the application context , so that all beans will be destroyed




    }

    public static void qualifierExample()
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(ConfigClass.class);
        Human human =  app.getBean("Human", Human.class);
        human.tryColdDrink();
    }

    public static void scopeExample()
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(ConfigClass.class);
        /* First a1 = app.getBean("first", First.class);
        First a2 = app.getBean("first", First.class);
        First a3 = app.getBean("first", First.class);

        System.out.println("----------------------------------------------");
        System.out.println("No of instance created of First :"+First.count);  // 1 will be printed since only once the instance is created later the copy is only provided
        //Print the ids of all the instances of class First

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        /*
        * ALl the ids will be same since only one instance is created then we container is providing the copy of
        * the that instance since this class is Singleton
        * */

        System.out.println("----------------------------------------------");

        Second s1 = app.getBean("second", Second.class);
        Second s2 = app.getBean("second", Second.class);
        Second s3 = app.getBean("second", Second.class);

        System.out.println("----------------------------------------------");

        System.out.println("Second Id : "+s1.toString());
        s1.runSecond();
        System.out.println("----------------------------------------------");

        System.out.println("Second Id : "+s2.toString());
        s2.runSecond();
        System.out.println("----------------------------------------------");

        System.out.println("Second Id : "+s3.toString());
        s3.runSecond();
        System.out.println("----------------------------------------------");

    }


    public static void main( String[] args )
    {
        /*
        System.out.println("We need to start the CAR");
        Car car = new Car();
        car.start();   // Here we are injecting, we are calling or using our functionality


        //Now there will be requirement that we need to provide particular engine so the below is the functionality

        //Still is not a loose coupled , since we are creating and providing the dependency
        Engine myEngine = new Engine();
        NewCar latestCar = new NewCar(myEngine);  //Here Dependency is injecting not statically but need to manage by the user
        latestCar.start();
        */

        //xmlConf();
        //javaConf();
        //qualifierExample();
        scopeExample();
    }
}
