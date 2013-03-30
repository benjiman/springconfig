package springexample;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
