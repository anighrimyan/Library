import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> book;
    private int countOfUserBook;
    User(String name, Book book) {
        setName(name);
        takeBook(book);
    }
    private void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalStateException("Invalid value for user's name.");
        }
    }
    private boolean takeBook(Book book) {
        if (book != null) {
            this.book.add(book);
            ++countOfUserBook;
            return true;
        } else {
            throw new IllegalStateException("Invalid value for book.");
        }
    }
    public boolean returnBook(Book book) {
       for (Book currentBook : this.book) {
           if (currentBook.equals(this.book)) {
               this.book.remove(book);
               --countOfUserBook;
               return true;
           }
       }
        return false;
    }
    public void read() {
        System.out.println("Start read a book.");
    }
}
