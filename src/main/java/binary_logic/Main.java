package binary_logic;

public class Main {
    public static void main(String[] args) {
        TextBook textBook = new TextBook("Short Story", "Edgar Allen Poe", 39.99, "Educational");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 29.99, "Drama");

        Book[] bookList = new Book[2];
        bookList[0] = textBook;
        bookList[1] = novel;

        BookStore store = new BookStore(bookList);

        try {
            store.displayBooks();
        } catch(NullPointerException e) {
            System.out.println("No Books on file.");
        }
    }
}
