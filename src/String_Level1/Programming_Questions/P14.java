
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="15 august is independence day";
        String S= "   h    ";
        S=S.trim();
        for(int i=0;i<s.length();i++)
        {
            s=s.replace("15 august","26 january");
            s=s.replace("independence day","republic day");
            
        }
        System.out.println(s);
        System.out.println(S);
    }

}
