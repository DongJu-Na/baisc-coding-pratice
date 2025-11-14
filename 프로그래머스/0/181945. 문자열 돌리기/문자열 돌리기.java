import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int x=0;x<a.length();x++){
            char c = a.charAt(x);
            System.out.println(c);
        }
        
        sc.close();
        
    }
}