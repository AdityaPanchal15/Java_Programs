public class AccessBook {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }
		
		Books b1=bookDao.getBookByIsbn(0);
		System.out.println(b1.getBookName());

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}