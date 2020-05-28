
package daliy_Asing;

import java.util.Scanner;


public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1= sc.next();
        String S2= sc.next();
        String R="";
        
        for(int i=S2.length()-1;i>=0;i--)
        {
            R=R+S2.charAt(i);
        }
        String S3= S1.concat(R);
        System.out.println(S3);
        
    }

}
