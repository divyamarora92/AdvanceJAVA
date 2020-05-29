
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch;
        boolean isvisited=true;
        boolean visited[] = new boolean[s.length()];
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            isvisited = false;
            
            for(int j=0;j<s.length();j++)
                
            {
                if(s.charAt(j)==ch && !visited[j])
                    
                {
                    visited[j]=true;
                    isvisited = true;
                    count=count+1;    
                }
            }
            if(isvisited)
            {
            System.out.println(ch+" appeared "+count+" times.");
            }
            count=0;
            
        }
    }

}
