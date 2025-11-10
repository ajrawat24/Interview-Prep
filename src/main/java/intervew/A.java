package intervew;
public class A {
    static
    {
        System.out.print("1");
    }

    {
        System.out.print("2");
    }

    public A()
    {
        System.out.print("3");
    }



    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();
    }
}
