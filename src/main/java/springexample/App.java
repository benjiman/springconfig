package springexample;

public class App {
    BookProvider library;

    public void doSomething() {
        System.out.println("************************");

        Book loTR = library.getBook("Patterns of Enterprise Application Architecture");
        library.returnBook(loTR);

        System.out.println("************************");
    }

    public void setLibrary(BookProvider bookProvider) {
        this.library = bookProvider;
    }

    public BookProvider getLibrary() {
        return library;
    }
}


