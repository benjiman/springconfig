package springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ParameterConfig.class, AppContext.class);
        context.getBean(App.class).doSomething();
    }
}
