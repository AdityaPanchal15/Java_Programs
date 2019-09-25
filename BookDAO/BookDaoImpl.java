import java.util.ArrayList;
import java.util.List;

interface BookDao {

    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);
}



public class BookDaoImpl implements BookDao {

    //list is working as a database
    private List<Books> books;

    public BookDaoImpl() {
        books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "Python"));
        books.add(new Books(3, "Android"));
    }

    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Books book) {
        books.remove(book);
    }
}
