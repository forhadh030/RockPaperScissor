package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Trick_Questions {

    public static String FizzBizz(int num) {
        String result = "";
        if(num % 3 == 0) {
            result = "Fizz";
        } else if(num % 5 == 0) {
            result = "Buzz";
        } return result;
    }

    public static void main(String[] args) throws Exception {
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        System.out.println(FizzBizz(9));

        int[] sum = {10, 9, 5, 20, 15, 8, 1, 3, 11};

        int min = Integer.MAX_VALUE;
        int increment = 0;
        for(int i = 1; i < sum.length; i++) {
            if(sum[increment] > sum[i]) {
                min = Math.min(min, sum[i]);
                increment = i;
            }
        }
        System.out.println("1) index = " + increment + " & min value = " + min);

        // Stream solution
        OptionalInt mini = IntStream.range(0, sum.length)
                .reduce((i, j) -> sum[i] > sum[j] ? j : i);

        int index = mini.orElse(-1);
        int minValue = index != -1 ? sum[index] : Integer.MAX_VALUE;

        System.out.println("2) index = " + index + " & min value = " + minValue);

        String name = "Syed";
        char[] n = name.toCharArray();
        for(char i = 0; i < name.length(); i++) {
            System.out.print(n[i] + " ");
        }
    }
}