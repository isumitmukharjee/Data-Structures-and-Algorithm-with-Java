import java.util.Arrays;

public class anagramOfString {
    public static void main(String[] args) {
        String s1 = "SILENTY";
        String s2 = "LISTEN";

        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);

        if(ch1.length != ch2.length){
            System.out.println("Not Anagram");
            System.exit(0);

        }

        for(int i=0;i<ch1.length;i++){
            if(ch1[i] != ch2[i]){
                System.exit(0);
            }
        }

        if(Arrays.equals(ch1, ch2)){
            System.out.println("is Anagram");
        }else {
            System.out.println("Not anagram");
        }
    }
}
