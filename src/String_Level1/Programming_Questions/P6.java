
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Strings are equal");
            
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }

}
