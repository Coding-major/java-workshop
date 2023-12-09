public class Book {
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

    //getters

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getISBN() {
        return isbn;
    }

}


