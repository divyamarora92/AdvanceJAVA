
package String_Level1.Pattern;

import java.util.Scanner;


public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
            {
                System.out.print(" ");
                
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(S.charAt(j));
                
            }
            if(i>0)
            {
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(S.charAt(j));
            }
            }
            System.out.println("");
        }
    }


}
