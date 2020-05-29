
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String R="";
        for(int i=S.length()-1;i>=0;i--)
        {
            R=R+S.charAt(i);
        }
        System.out.println(R);
        if(R.equalsIgnoreCase(S))
        {
            System.out.println("palindrome words");
        }
        else
        {
            System.out.println("Not palindrome Words");
        }
    }

}
