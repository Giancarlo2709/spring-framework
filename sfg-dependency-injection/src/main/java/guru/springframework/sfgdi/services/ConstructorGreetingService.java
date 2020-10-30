package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created By Giancarlo on 10/29/2020
 */
@Service
public class ConstructorGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }
}
