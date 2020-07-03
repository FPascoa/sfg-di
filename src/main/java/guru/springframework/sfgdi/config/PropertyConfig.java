package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//  @PropertySource("classpath:datasource.properties"),
//  @PropertySource("classpath:jms.properties")  
//})
public class PropertyConfig {

//  @Autowired
//  Environment env;

  @Value("${guru.user}")
  String user;
  @Value("${guru.password}")
  String password;
  @Value("${guru.durl}")
  String url;

  @Value("${guru.jms.user}")
  String jmsUser;
  @Value("${guru.jms.password}")
  String jmsPassword;
  @Value("${guru.jms.durl}")
  String jmsUrl;

//  @Bean
//  public static PropertySourcesPlaceholderConfigurer properties() {
//    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//    return propertySourcesPlaceholderConfigurer;
//  }

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUser(user);

//    String password = env.getProperty("PASSWORD");
//    if (StringUtils.isEmpty(password)) {
//      password = this.password;
//    }
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUser(jmsUser);
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    return fakeJmsBroker;
  }

}
