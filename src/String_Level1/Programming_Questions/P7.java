
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        switch(s1)
        {
            case "Monday":
                System.out.println(s1+":1");
                break;
            case "Tuesday":
                System.out.println(s1+":2");
                break;
            case "Wednesday":
                System.out.println(s1+":3");
                break;
            case "Thursday":
                System.out.println(s1+":4");
                break;
            case "Friday":
                System.out.println(s1+"5");
                break;
            case "Saturday":
                System.out.println(s1+"6");
                break;
            case "Sunday":
                System.out.println(s1+"7");
                break;
        }
        
    }

}
