package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public interface GreetingRepository {

  String getEnglishGreeting();

  String getSpanishGreeting();

  String getGermanGreeting();
}
