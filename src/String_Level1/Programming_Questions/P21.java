
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String A[] = S.split(" ");
        String R="";
        String P="";
        for(int i=0;i<A.length;i++)
        {
            for(int j=A[i].length()-1;j>=0;j--)
            {
            R=R+A[i].charAt(j);
            }
            if(R.equalsIgnoreCase(A[i]))
            {
                System.out.println(R);
                R="";
                
            }
            else
            {
               R="";
            }
        
        }
        
             System.out.println(P);
        
    }

}
