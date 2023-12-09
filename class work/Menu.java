import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    public Book(String title, String author, int publicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
    }

    public gettitle() {
        return this.title;
    }

}
    
class library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book has been added successfully");
    }
3.
    public void displayBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void searchByTitle(String title) {
        String found = "false";
        for (Book book: books) {
            if (book.title === title) {

            }
            System.out.println();
        }
    }
}
