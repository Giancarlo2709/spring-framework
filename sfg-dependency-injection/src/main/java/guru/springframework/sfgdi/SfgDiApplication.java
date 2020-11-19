package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created By Giancarlo on 10/29/2020
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework.sfgdi"})
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    /*I18nController i18nController = ctx.getBean(I18nController.class);
    System.out.println(i18nController.sayHello());

    MyController myController = ctx.getBean(MyController.class);
    String greeting = myController.sayHello();
    System.out.println(greeting);*/

    /*System.out.println("------ Primary Bean");
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

    System.out.println("------ Spring beans");
    MyController controller = (MyController) ctx.getBean("myController");

    System.out.println(controller.sayHello());
    System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
    System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());*/
    fakeDataSource(ctx);
  }

  public static void fakeDataSource(ApplicationContext ctx ) {
    FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
    System.out.println(fakeDataSource.getUser());

    FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
    System.out.println(fakeJmsBroker.getUser());
  }

}
