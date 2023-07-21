package Students;

import java.util.Scanner;

public class StudentManagement implements StudentServices{
    private static final int MAX_STUDENTS = 20;
    public static Student[] studentsList = new Student[MAX_STUDENTS];
    public static int numStudent = 0;

    @Override
    public void addStudent(Scanner scan) {
        if(numStudent >= MAX_STUDENTS) {
            System.out.println("Sorry, we're at capacity.");
            return;
        }
        System.out.print("Please provide student ID: ");
        int studentId = scan.nextInt();

        // consume the newLine character left in the buffer reading the int value.
        scan.nextLine();

        System.out.print("Please enter your/student name: ");
        String studentName = scan.nextLine();

        System.out.print("Please enter your/student email: ");
        String studentEmail = scan.nextLine();

        System.out.print("Please enter your/student grade: ");
        double studentGrade = scan.nextDouble();

        Student student = new Student(studentId, studentName, studentEmail, studentGrade);
        studentsList[numStudent++] = student;
        System.out.print("Student added successfully");
    }

    @Override
    public void removeStudent(Scanner scan) {
        if(numStudent == 0) {
            System.out.println("There are no student available to remove");
        }
        System.out.print("Enter the index of the student to remove (0) to " + (numStudent - 1) + ": ");
        int index = scan.nextInt();

        if(index >= 0 && index < numStudent) {
            for(int i = index; i < numStudent - 1; i++) {
                studentsList[i] = studentsList[i+1];
            }
            studentsList[numStudent - 1] = null;
            numStudent--;
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Invalid index, No student removed.");
        }
    }

    @Override
    public void readStudents() {
        if(numStudent == 0) {
            System.out.println("No student available");
        }
        for(int i = 0; i < numStudent; i++) {
            System.out.println(i + 1 + ". ");
            System.out.println(studentsList[i]);
        }
    }

    @Override
    public void updateStudent(Scanner scan) {
        if(numStudent == 0) {
            System.out.println("No student available");
        }
        System.out.print("Enter the index of the student to update (0) to " + (numStudent - 1) + ": ");
        int index = scan.nextInt();

        if(index >= 0 && index < numStudent) {
            System.out.print("Enter the student new id: ");
            int newStudentId = scan.nextInt();

            scan.nextLine();

            System.out.print("Enter new student name: ");
            String newStudentName = scan.nextLine();

            System.out.print("Enter new student email: ");
            String newStudentEmail = scan.nextLine();

            System.out.print("Enter new student grade: ");
            double newStudentGrade = scan.nextDouble();

            Student updatedStudent = new Student(newStudentId, newStudentName, newStudentEmail, newStudentGrade);
            studentsList[index] = updatedStudent;
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Invalid index; No student updated");
        }
    }
}
