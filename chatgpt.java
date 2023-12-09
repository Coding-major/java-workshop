import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
    private String genre;

    public Book(String title, String author, int publicationYear, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear +
                "\nISBN: " + isbn + "\nGenre: " + genre;
    }
}

class MysteryBook extends Book {
    public MysteryBook(String title, String author, int publicationYear, String isbn) {
        super(title, author, publicationYear, isbn, "Mystery");
    }
}

class ScienceFictionBook extends Book {
    public ScienceFictionBook(String title, String author, int publicationYear, String isbn) {
        super(title, author, publicationYear, isbn, "Science Fiction");
    }
}

class RomanceBook extends Book {
    public RomanceBook(String title, String author, int publicationYear, String isbn) {
        super(title, author, publicationYear, isbn, "Romance");
    }
}

class Library {
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book added to the catalog.");
    }

    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            for (Book book : catalog) {
                System.out.println("\n" + book);
            }
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:\n" + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title: " + title);
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Books found by author " + author + ":");
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author: " + author);
        }
    }

    public void removeBook(Book book) {
        if (catalog.remove(book)) {
            System.out.println("Book removed from the catalog.");
        } else {
            System.out.println("Book not found in the catalog.");
        }
    }
}

public class chatgpt {

    public static void main(String[] args) {
        
    }
    private Library library = new Library();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nLibrary Catalog System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Catalog");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Author");
            System.out.println("5. Remove a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                library.displayCatalog();
            } else if (choice == 3) {
                searchByTitle();
            } else if (choice == 4) {
                searchByAuthor();
            } else if (choice == 6) {
                exit = true;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter the title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Enter the publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter the ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter the genre (Mystery/Science Fiction/Romance): ");
        String genre = scanner.nextLine();

        Book book;
        if ("Mystery".equalsIgnoreCase(genre)) {
            book = new MysteryBook(title, author, publicationYear, isbn);
        } else if ("Science Fiction".equalsIgnoreCase(genre)) {
            book = new ScienceFictionBook(title, author, publicationYear, isbn);
        } else if ("Romance".equalsIgnoreCase(genre)) {
            book = new RomanceBook(title, author, publicationYear, isbn);
        } else {
            System.out.println("Invalid genre. Book not added.");
            return;
        }

        library.addBook(book);
    }

    private void searchByTitle() {
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        library.searchByTitle(title);
    }

    private void searchByAuthor() {
        System.out.print("Enter the author to search for: ");
        String author = scanner.nextLine();
        library.searchByAuthor(author);
    }

    // private void removeBook() {
    //     System.out.print("Enter the title of the book to remove: ");
    //     String title = scanner.nextLine();
    //     System.out.print("Enter the author of the book to remove: ");
    //     String author = scanner.nextLine();

    //     for (Book book : library) {
    //         if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
    //             library.removeBook(book);
    //             return;
    //         }
    //     }
    //     System.out.println("Book not found in the catalog.");
    // }
}
