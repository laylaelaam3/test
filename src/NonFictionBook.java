public class NonFictionBook extends Book {
    private String genre;

    public NonFictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' + ", type='"+
                "genre='" + genre + '\'' +
                '}';
    }
}

