package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public int getSum(int num, int num1) {
        int result = 0;
        for(int i = num; i < num1; i++) {
            result += i;
        } return result;
    }

    public void getResult() {
        System.out.println("The answer is " + getSum(5, 15));
    }

    public static double findDiff(double n, double n1) {
        return n / n1;
    }

    public static void main(String[] args) {

        NumberFormat percentageFormat = NumberFormat.getPercentInstance();
        String percentage = percentageFormat.format(findDiff(5, 20));

        DecimalFormat decimalFormat = new DecimalFormat("0.0%");
        String decimal = decimalFormat.format((findDiff(1, 3)));

        System.out.println("The answer is: " + percentage);
        System.out.println("The 2nd answer is " + decimal);

        Main math = new Main();
        int final_result = math.getSum(10, 35);

        System.out.println("Final result is: " + final_result);
        math.getResult();

        // Cars 2 example
        Car myCar = new Car("Honda", "CR-V", 2023, "Blue", 4123);
        Car car = new Car("Toyota", "RAV-4", 2022, "White", 12782);
        car.setYear(2023); // changed the date from 2022 to 2023
        System.out.println(car.getYear());
        System.out.println(myCar.getColor());

        // Books 2 example
        Book book = new Book("Cracking the Coding Interview",
                "Gayle Laakmann McDowell",
                "Educational",
                "July 1, 2015", "0984782869");
        Book myBook = new Book("Edgar Allan Poe: Complete Tales & Poems",
                "Edgar Allan Poe",
                "Short Story",
                "July 10, 2014",
                "0984782868");
        book.displayBook();
        myBook.displayBook();

        // Student 2 example
        Student s = new Student("Harry", 123, "Comp Science", 3.8, "Jan 1, 1988");
        s.studentInfo();
        Student t = new Student();
        s.name = "Mark";
        System.out.println(s.name);

        // Products 2 example
        Product p = new Product("Autonomous SmartDesk Core",
               399.00, "Automatic table", 1, "Ergonamic");
        Product c = new Product("Autonomous ErgoChair Pro", 499.00, "Comfortable Chair",
                1, "Ergonomic");
        p.prodInfo();
        c.prodInfo();

        // Item 2 example
        Item i = new Item("iPhone 14 Pro", "Apple Phone", 1, 999, "Cell Phone");
        Item l = new Item("MacBook Air", "Apple Laptop", 1, 1299, "Laptop");
        i.displayItem();
        l.displayItem();

        System.out.println("--------------------------------");
        System.out.println("The number of letters are: " + letters("Alpha%&?30 Alpha"));
    }

    public static int letters(String word) {
        int count = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }
}