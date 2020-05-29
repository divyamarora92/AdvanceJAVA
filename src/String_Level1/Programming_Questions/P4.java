
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char A[]={'a','e','i','o','u','A','E','I','O','U'};
        int Vcount=0;
        boolean visited[]= new boolean[A.length];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<A.length;j++)
            {
            if(s.charAt(i)==A[j] && !visited[j])
            {
                Vcount++;
                visited[j]=true;
                
            }
            }

         }
        System.out.println(Vcount);
    }

}
