import java.util.ArrayList;


public class Library  {
    ArrayList<Book>bookCollection=new ArrayList<>();
    public void addBook(Book book){
        bookCollection.add(book);
    }
    public void removeBook(Book book){
        bookCollection.remove(book);
    }
    public void displayInformation(){
        for(Book e:bookCollection){
            System.out.println(e.toString());
        }
    }
}
