
package String_Level1.Pattern;

import java.util.Scanner;


public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(s.charAt(j));
                
            }
            if(i>0)
            {
             for(int j=0;j<i;j++)
             {
                String S=s.toLowerCase();
                 System.out.print(S.charAt(j));
                 S=s;
                 
             }
            }
            System.out.println("");
        }

    }
    

}
