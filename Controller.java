import java.util.Scanner;

public class Controller {
    {
        System.out.println("Enter the appropriate code to perform an action.");
        System.out.println("    0 -> Add a book in library. \n 1 -> Create a user. \n 2 -> Return of book.");
    }
    private Book enterInfoAboutBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book's title: ");
        String title = sc.nextLine();
        System.out.println();
        System.out.print("Enter the book's auther: ");
        String auther = sc.nextLine();
        System.out.println();
        return new Book(title, auther);
    }
    public void doOperation() {
        Scanner sc = new Scanner(System.in);
        int opCode = sc.nextInt();
        int doOperation = switch (opCode) {
            case 0: {
                Book book = enterInfoAboutBook();
                Library lib = new Library();
                lib.addBook(book);
                System.out.println("The operation was successfully completed.");
                yield 0;
            }
            case 1: {
                System.out.print("Enter the user's name: ");
                Scanner sr = new Scanner(System.in);
                String name = sr.nextLine();
                System.out.println();
                Book book = enterInfoAboutBook();
                Library lib = new Library();
                if (lib.checkBookInLibrary(book)) {
                    lib.giveBook();
                    User user = new User(name, book);
                    lib.addUser(user);
                    user.read();
                } else {
                    System.out.println("This book is not available in the library.");
                }
                yield 1;
            }
            case 2: {
                System.out.println("Enter the user's name.");
                Scanner scr = new Scanner(System.in);
                String name = scr.nextLine();
                Book book = enterInfoAboutBook();
                User user = new User(name, book);
                Library lib = new Library();
                if (lib.findUser(user)) {
                    lib.takeBookFromUser();
                    user.returnBook(book);
                } else {
                    System.out.println("Something gone wrong.");
                }
            }
            default:
                throw new IllegalStateException("Invalid code: ");
        };
    }
}
