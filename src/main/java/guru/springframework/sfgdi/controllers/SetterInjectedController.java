package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

import static guru.springframework.sfgdi.Constants.CONTROLLER_SETTER;

@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  @Autowired
  @Qualifier(CONTROLLER_SETTER)
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
