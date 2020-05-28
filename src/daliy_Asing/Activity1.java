
package daliy_Asing;

//Reverse A String

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String R="";
        int j=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                R=R+s.substring(i+1,j)+" ";
                j=i;
                
            }
            else if(i==0)
            {
                R=R+s.substring(i, j);
            }
            
        }
        System.out.println(R);
            
        
        
    }

}
