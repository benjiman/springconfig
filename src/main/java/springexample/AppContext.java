package springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springexample")
public class AppContext {

    @Autowired Office office;

    @Bean public BookProvider bookProvider() {
        Library library = new Library();
        library.setLocation(office);
        library.setName("dev");
        return library;
    }
}
