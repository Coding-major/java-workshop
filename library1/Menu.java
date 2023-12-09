import java.util.ArrayList;
import java.util.Scanner;

class Book {
    protected String title;
    public String author; 
    private int publicationYear;
    private String isbn;

    public Book(String title, String author,int publicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
    }

}


class library {
    ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book newBook) {
        catalog.add(newBook);
    }

    public void display() {
        for(Book book: catalog) {
            System.out.println(book);
        }
    }

    public void searchBookByTitle(String title) {
        for(Book i:catalog) {
            if(i.title == title) {
                System.out.println(i +"\n");
            }
        }
    }

    public void searchBookByauthor(String author) {
        for(Book i:catalog) {
            if(i.author == author) {

            }
        }
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }
}

public class Menu {
    public static void main(String[] args) {
        library library1 = new library();
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("\nLibrary Catalog System Menu:");
        System.out.println("1. Add a Book");
        System.out.println("2. Display Catalog");
        System.out.println("3. Search by Title");
        System.out.println("4. Search by Author");
        System.out.println("5. Remove a Book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        while (true || input<6) {
            if(input == 1) {
            System.out.println("enter book title: ");
            String title = scanner.nextLine();
            System.out.println("enter author's name: ");
            String author = scanner.nextLine();
            System.out.println("enter publication year: ");
            int year = scanner.nextInt();
            System.out.println("enter isbn: ");
            String isbn = scanner.nextLine();

            Book added = new Book(title, author, year, isbn);
            library1.addBook(added);
            } else if (input == 2) {
                System.out.println("enter title: ");
                library1.display();
            }
        }
        

    }
   
}
