
package String_Level1.Programming_Questions;

import java.util.Scanner;


public class P11 {

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz enter any String");
      String name,name1,name2,name3 = "";
      int l,i;
      char ch;
      name = sc.nextLine();
      name = name.toLowerCase();
      l = name.length();
      for(i =0;i<l;i++)
      {
        ch = name.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            break;
        }
      }
      name1 = name.substring(0, i);
      name2 = name.substring(i);
      name3 = name2 + name1 + "ay";
      System.out.println("Piglatin form is  " + name3);
    }

}
