package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

import static guru.springframework.sfgdi.Constants.CONTROLLER_CONSTRUCTOR;

@Controller
public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier(CONTROLLER_CONSTRUCTOR) GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
