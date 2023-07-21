package binary_logic;

public class Novel extends Book{
    private String genre;
    public Novel(String title, String author, double price,String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " +getTitle() + ",\n Author: " + getAuthor() + ",\n Price: " + getPrice() + ",\n Genre: " + genre);
    }
}
