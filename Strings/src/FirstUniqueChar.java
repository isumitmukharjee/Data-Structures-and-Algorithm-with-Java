import java.util.*;

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];  // Frequency array for a-z

        // First pass: Count frequencies
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Second pass: Find first character with frequency 1
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;  // If no unique character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Processing
        int index = firstUniqChar(input);

        // Output
        if(index == -1) {
            System.out.println("No unique character found.");
        } else {
            System.out.println("First unique character is '" + input.charAt(index) + "' at index " + index);
        }

        sc.close();
    }
}
