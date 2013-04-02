package springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springexample")
public class AppContext {
    @Bean public BookProvider bookProvider() {
        Library library = new Library();
        library.setLocation(Office.London);
        library.setName("dev");
        return library;
    }
}
