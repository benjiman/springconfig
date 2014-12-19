package springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springexample")
public class ParameterConfig {
    @Bean public Office london() {
        return Office.London;
    }
}
