package springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class App {

    BookProvider library;

    public void doSomething() {
        System.out.println("************************");

        Book loTR = library.getBook("Patterns of Enterprise Application Architecture");
        library.returnBook(loTR);

        System.out.println("************************");
    }
}


