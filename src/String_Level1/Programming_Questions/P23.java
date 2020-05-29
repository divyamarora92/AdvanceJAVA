
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S[] =new String[6];
        int[] rollNos = new int[6];
        for(int i=1;i<=5;i++)
        {
            rollNos[i]=sc.nextInt();
            S[i]=sc.next();  
        }
        System.out.println("R.N"+"   "+"Name");
        for(int i=1;i<=5;i++)
        {
            System.out.println(rollNos[i]+"   "+S[i]);
        }
    }

}
