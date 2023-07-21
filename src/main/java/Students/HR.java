package Students;

import java.util.Scanner;

public class HR extends StudentManagement{
    public static void main(String[] args) {
        StudentManagement teach = new StudentManagement();
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
            System.out.println("--------- Welcome To Student Management App ---------");
            System.out.println("1 - Add Student");
            System.out.println("2 - Remove Student");
            System.out.println("3 - Update Student");
            System.out.println("4 - Display all Students");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1 -> teach.addStudent(scan);
                case 2 -> teach.removeStudent(scan);
                case 3 -> teach.updateStudent(scan);
                case 4 -> teach.readStudents();
                case 5 -> System.out.println("Exiting the program.");
                default -> System.out.println("invalid input.");
            }
        }
        while(choice != 5);
        scan.close();
    }
}
