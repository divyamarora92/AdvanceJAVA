
package String_Level1.Pattern;

import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(S.charAt(j));
            }
            System.out.println("");
        }
    }

}
