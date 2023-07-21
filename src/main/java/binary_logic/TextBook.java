package binary_logic;

public class TextBook extends Book{
    private String subject;

    public TextBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    public String getSubject(String subject) {
        return subject;
    }

    public void setSubject() {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("title = " + getTitle() +
                ",\n author = " + getAuthor() +
                ",\n price = " + getPrice() +
                ",\n subject = " + subject);
    }
}