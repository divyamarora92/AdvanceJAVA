
package daliy_Asing;

import java.util.Scanner;


public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean visited[] = new boolean[s.length()];
        boolean isread;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            isread=false;
            
            for(int j=0;j<s.length();j++)
            {
                if(ch==s.charAt(j) && !visited[j])
                {
                    visited[j]=true;
                    isread=true;
                    count++;
                }
            }
            if(isread==true)
            {
            System.out.println(ch+" occured "+count+" times");
            }
            count=0;
            
        }
    }

}
