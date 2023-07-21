package binary_logic;

public class BookStore {

    private  Book[] books;

    public BookStore(Book[] books) {
        this.books = books;
    }

    public void displayBooks(){
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }
}