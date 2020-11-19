package guru.springframework.sfgdi.services;

/**
 * Created By Giancarlo on 10/29/2020
 */
public class PrimaryGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - From the Primary Bean";
  }
}
