import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for(int i=0;i<a.length();i++){
            char characters = a.charAt(i);

            if(Character.isUpperCase(characters)){
                result +=  Character.toLowerCase(characters);
            }else{
                result += Character.toUpperCase(characters);
            }
        }

        System.out.println(result);
        sc.close();
        
    }
}