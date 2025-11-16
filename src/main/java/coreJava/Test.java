package coreJava;
class Parent {
    void call() { System.out.println("Parent"); }
}
class Child extends Parent {
    void call() { System.out.println("Child"); }
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.call();
    }
}