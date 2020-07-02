package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

import static guru.springframework.sfgdi.Constants.CONTROLLER_PROPERTY;

@Controller
public class PropertyInjectedController {

  @Qualifier(CONTROLLER_PROPERTY)
  @Autowired
  public GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
