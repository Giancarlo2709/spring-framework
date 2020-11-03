package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created By Giancarlo on 10/29/2020
 */
@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    I18nController i18nController = ctx.getBean(I18nController.class);
    System.out.println(i18nController.sayHello());

    MyController myController = ctx.getBean(MyController.class);
    /* String greeting = myController.sayHello();
    System.out.println(greeting);*/

    System.out.println("------ Primary Bean");
    System.out.println(myController.sayHello());

    System.out.println("------ Property");

    PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("------ Setter");
    SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
    System.out.println(setterInjectedController.getGreeting());

    System.out.println("------ Constructor");
    ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
    System.out.println(constructorInjectedController.getGreeting());
  }

}