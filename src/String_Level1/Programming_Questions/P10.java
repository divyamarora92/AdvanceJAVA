
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P10 {
     public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any String");
        String S=sc.nextLine();
        String Sub="";
       
        
        Sub = S.substring(0, 3);
        
        
        System.out.println("The SubString " + Sub);
        
        
    }

}
