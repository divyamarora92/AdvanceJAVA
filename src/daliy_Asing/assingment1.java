
package daliy_Asing;


public class assingment1 {

   
    
    
    public static void m1()
    {
        System.out.println("Method 1");
        
    }
    public int m2()
    {
        int a=1;
        return a;
        
    }
    public static int m3(int a)
    {
        System.out.println(a);
        return a;
    }
    public static char m4(char a,String b)
    {
        System.out.println(a+b);
        return a;
        
    }
    public static void main(String[] args) {
       assingment1 p = new assingment1();
       m1();
       //Accesing non Static methods
       int s=p.m2();
        System.out.println(s);
       m3(2);
       m4('d',"divyam");
       
        
    }

}
