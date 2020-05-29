
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String S="";
        String c ="";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
               c=s.substring(i,i+1).toLowerCase();
               S=S.concat(c);
               
               
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
               c=s.substring(i,i+1).toUpperCase();
               S=S.concat(c);
               
                
            }
        }
        System.out.println(S);
        
    }

}
