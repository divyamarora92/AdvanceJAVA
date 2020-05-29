
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String S="";
        for(int j=0;j<s.length();j++)
        {
            if(j==0)
            {
              char ch=Character.toTitleCase(s.charAt(j));  
              S=S.concat(Character.toString(ch));
                
            }
            else if( s.charAt(j)==' ')
            {
              S=S+" ";
              char ch=Character.toTitleCase(s.charAt(j+1));  
              S=S.concat(Character.toString(ch));
              j++;
            }
            else
            {
                S=S+s.charAt(j);   
            }
            
        }
        System.out.println(S);
        
    

}
}    
