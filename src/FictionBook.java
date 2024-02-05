public class FictionBook extends Book{
    private String type;

    public FictionBook(String title, String author, String isbn, String type) {
        super(title, author, isbn);
        this.type = type;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' + ", type='"+type+
                '}';
    }
}

