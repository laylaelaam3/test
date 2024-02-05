public class MainL {
    public static void main(String[] args) {
        Library library=new Library();
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book fictionBook=new FictionBook("ttt","vvvv","ffgh","vjhvh");
        Book nonFictionBook=new NonFictionBook("jhedjh","sdcv","scdcd",",vvdcd");
       library.addBook(fictionBook);
       library.addBook(nonFictionBook);
       library.addBook(book);
       library.displayInformation();

    }
}
