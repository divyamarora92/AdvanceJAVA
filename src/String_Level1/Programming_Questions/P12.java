
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any string");
        String S;
        S = sc.nextLine();
        S = S.toLowerCase();
        if(S.startsWith("mr "))
        {
            System.out.println("Male");
        }
        else if(S.startsWith("miss  "))
        {
            System.out.println("Female");
        }
        else if(S.startsWith("mrs"))
        {
            System.out.println("Married Female");
        }
        else if(S.startsWith("kumari "))
        {
            System.out.println("Un-Married Female");
        }
        else
        {
            System.out.println("Cannot-determine");
        }
    }

}
