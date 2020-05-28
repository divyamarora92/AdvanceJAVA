
package daliy_Asing;

import java.util.Scanner;


public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vcount=0;
        char A[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<A.length;j++)
            {
            if(s.charAt(i)==A[j])
            {
                vcount++;
                s=s.replace(s.charAt(i), 'z'); 
            }
            
            }

         }
        if(vcount==0)
        {
            System.out.println(s+" No vowels present");
        }
        else
        {
        System.out.println(s);
        }
    }
    
    

}
