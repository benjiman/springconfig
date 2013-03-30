package springexample;

public interface BookProvider {
    public Book getBook(String name);
    public void returnBook(Book book);
}
