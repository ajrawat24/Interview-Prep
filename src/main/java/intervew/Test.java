package intervew;
class A {
    static void test() { System.out.println("A"); }
}
class B extends A {
    static void test() { System.out.println("B"); }
}
public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.test();
    }
}