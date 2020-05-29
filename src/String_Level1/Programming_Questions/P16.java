
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S[]=new String[5];
        char A[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<5;i++)
        {
            S[i]=sc.next();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<A.length;j++)
            {
            if(S[i].charAt(0)==A[j])
            {
                 System.out.println(S[i]);
                 
            }
            }
            
                
        }
    }

}
