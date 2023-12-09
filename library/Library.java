import java.util.Scanner;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("book has been added.");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book has been removed");
    }

    public void searchByTitle(String title) {
        String found = "false";
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = "true";
                System.out.println(book+"\n");
            }
            if (found == "false") {
                System.out.println("no book with the search title.");
            }
        }
    }

    public void searchByAuthor(String authorName) {
        String found = "false";
        for (Book book : books) {
            if (book.getAuthor() == authorName)
        }
    }

}
