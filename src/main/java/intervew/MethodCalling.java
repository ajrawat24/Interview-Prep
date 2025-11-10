
package intervew;
public class MethodCalling {
    public static void main(String[] args) {



        System.out.println("When Reference and Object is of type Child");
        Child obj1 = new Child();
        obj1.callMe1();


        System.out.println("When Reference and Object is of type Parent");
        Parent obj2 = new Parent();
        obj2.callMe1();


        System.out.println("When Reference is of type Parent and Object is of type Child");
        Parent obj3 = new Child();
        obj3.callMe1();
        obj3.printMe();

       // Child obj4 = new Parent();
        //obj4.callMe1();


    }
}

class Parent {
    int balance = 10000;
    static int marks = 97;

    public void callMe1() {
        System.out.println("In Parent 1");
    }

    public void callMe2() {
        System.out.println("In Parent 2");
    }

    public static void printMe() {
        System.out.println("Hi from static in parent");
    }

}

class Child extends Parent{

    int balance = 20000;
    static int marks = 100;

    @Override
    public void callMe1() {
        System.out.println("In Child 1");
    }

    public static void printMe() {
        System.out.println("Hi from static in child");
    }
}


