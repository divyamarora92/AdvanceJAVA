
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[]=s.split(" ");
        boolean visited[] = new boolean[a.length];
        String S="";
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            if( i+1<n-1 && s.charAt(i)==s.charAt(i+1) )
            {
                S=s.substring(i,i+2);
                
            
            for(int k=0;k<a.length;k++)
            {
                if(a[k].contains(S) && !visited[k])
                {
                    System.out.println(a[k]);
                    visited[k]=true;
                    break;
                }
            }
            }
            S=" ";  
        }
        
        
                  

        
    }

}
