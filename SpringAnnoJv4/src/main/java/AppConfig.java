import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

@Configuration
@ComponentScan({"java"})
//@PropertySource("app.properties")
public class AppConfig extends Application {

    /*
@Bean
public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceHolderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
}

     */
@Bean(name="customerService")
    public CustomerService getCustomerService() {
    //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
    CustomerServiceImpl service = new CustomerServiceImpl();
    //service.setCustomerRepository(getCustomerRepository());
    return service;
}

  @Bean(name="customerRepository")
  public CustomerRepository getCustomerRepository()
   {
      return new HibernateCustomerRepositoryImpl();
   }

}
