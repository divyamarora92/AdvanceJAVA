
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        String S="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && count>5 )
            {
                
                System.out.println(S);
                S="";
                count=0;
                i++;
            }
            else if(s.charAt(i)==' ' && count<5)
            {
                S="";
                count=0; 
            }
            else
            {
                S=S+s.charAt(i);
                count++;   
            }
        }
        
        
    }

}
