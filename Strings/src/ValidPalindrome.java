public class ValidPalindrome {

    // Method to check if a character is alphanumeric
    public boolean isAlphaNumeric(char c){
        return Character.isLetterOrDigit(c);
    }

    // Method to check if a string is a valid palindrome
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNumeric(s.charAt(l))) {
                l++;
            }
            while (l < r && !isAlphaNumeric(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    // Main method to test the code
    public static void main(String[] args) {
        ValidPalindrome sol = new ValidPalindrome();

        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "race a car",
                " ",
                "No lemon, no melon",
                "Was it a car or a cat I saw?",
                "not a palindrome"
        };

        for (String s : testCases) {
            System.out.println("Input: \"" + s + "\"");
            System.out.println("Is Palindrome? " + sol.isPalindrome(s));
            System.out.println("------------------------------");
        }
    }
}
