import java.util.Scanner;

public class BitManipulation {
    static String convert2Binary(int n){
        if(n==0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        while(n>0){
            if(n%2==1){
                res.append('1');
            }else{
                res.append('0');
            }
            n = n/2;
        }


        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convert2Binary(n));
        sc.close();

    }


}