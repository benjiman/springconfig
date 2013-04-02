package springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class Library implements BookProvider {
    private Location location;
    private String name;

    @Override
    public Book getBook(final String bookName) {
        System.out.println("Borrowing book " + bookName + " from " + name + " in " + location);
        return new Book(bookName);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Returning " + book.name + " to " + name + " in " + location);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }
}
