package org.example;

public class Switch {
    public static void main(String[] args) {
        int num = 0;

        String day = switch(num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }
}
