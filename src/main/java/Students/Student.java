package Students;

public class Student {
    private int id;
    public String name;
    String email;
    protected double grade;

    public Student(int id, String name, String email, double grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                '}';
    }
}
