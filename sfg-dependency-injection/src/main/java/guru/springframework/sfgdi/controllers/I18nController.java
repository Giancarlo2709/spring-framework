package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created By Giancarlo on 10/29/2020
 */
@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return this.greetingService.sayGreeting();
  }
}
