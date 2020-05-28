
package daliy_Asing;
    class Const
    {
        //Default Constructor
    public Const()
    {
        System.out.println("This is default constructor");
        
    }
    //Paramatrized Constructor
    public Const(String S)
    {
        System.out.println(S);
        
    }
}
public class assingment2 {
    //Static Mehtod
    public static void m1()
    {
        System.out.println("This is Static Method");
        
    }
    //Non Static Method
    public int method(int a)
    {
        int b=a+5;
        System.out.println("This is Non Static method");
        return b;
    }
    //Static Block
    static {
        System.out.println("This is static block");
        
    }
    //Instance Block
    {
        System.out.println("This is instance block");
    }
    public static void main(String[] args) {
       assingment2 A = new assingment2();
       Const C = new Const();
       Const D = new Const("This is paramatrized Constructor");
       m1();
       A.method(5);
        
        
        
        
        
    }

}
