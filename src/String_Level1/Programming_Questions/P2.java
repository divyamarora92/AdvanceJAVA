
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name :");
        String f = sc.next();
        System.out.print("Middle name :");
        String m = sc.next();
        System.out.print("Last name :");
        String l = sc.next();
        
       
            System.out.print(f+" "+m+" "+l+":"+f.charAt(0)+"."+m.charAt(0)+"."+l.charAt(0));
        
    }

}
