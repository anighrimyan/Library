import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private final String libraryName;
    private final String libraryAddress;
    private ArrayList<Book> books;
    private ArrayList<User> user;
    private int countOfBooks;
    {
        libraryName = "National Library of Armenia";
        libraryAddress = "72 Teryan St, Yerevan";
        books = new ArrayList<Book>();
    }
    public void addUser(User user) {
        this.user.add(user);
        ++countOfBooks;
    }
    public void addBook(Book book) {
        this.books.add(book);
        ++countOfBooks;
    }
    public boolean checkBookInLibrary(Book book) {
        for (Book currentBook : books) {
            return true;
        }
        return false;
    }
    public void giveBook() {
        if (countOfBooks > 0) {
            --countOfBooks;
        } else {
            System.out.println("This book is not available in the library.");
        }
    }
    public void takeBookFromUser() {
      ++countOfBooks;
    }
    public boolean findUser(User user) {
        for (int i = 0; i < this.user.size(); ++i) {
            if (user.equals(this.user)) {
                return true;
            }
        }
        return false;
    }
}
