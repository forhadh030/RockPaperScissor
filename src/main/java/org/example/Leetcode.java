public class Leetcode {
    public static void main(String[] args) {

        // Input string
        String s = "I am from Bangladesh";

        // Convert the string to a character array
        char[] split = s.toCharArray();

        // Pointers for swapping characters
        int left = 0;
        int right = split.length - 1;
        char temp;

        // Reverse the words in the string
        while (left <= right) {
            // Move the left pointer if a space is encountered
            if (split[left] == ' ') {
                left++;
            }
            // Move the right pointer if a space is encountered
            else if (split[right] == ' ') {
                right--;
            }
            // Swap characters at left and right positions
            else {
                temp = split[left];
                split[left] = split[right];
                split[right] = temp;
                left++;
                right--;
            }
        }

        // Convert the character array back to a string and print
        System.out.println(new String(split));
    }
}

