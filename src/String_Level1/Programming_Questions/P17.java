
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s= sc.next();
       String S= "";
       String c="";
       for(int i=0;i<s.length();i++)
       {
           if(i%2==0)
           {
               c=s.substring(i,i+1).toLowerCase();
               S=S.concat(c);
               
           }
           else
           {
               c=s.substring(i,i+1).toUpperCase();
               S=S.concat(c);
               
           }
       }
        System.out.println(S);
        
    }

}
