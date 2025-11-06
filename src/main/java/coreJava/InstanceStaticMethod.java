package coreJava;

public class InstanceStaticMethod {

    private int x;             // instance variable
    private static int y;      // static variable

    // Instance setter and getter
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    // Static setter and getter
    public static int setY(int y) {
        InstanceStaticMethod.y = y;
        return y;
    }

    public static int getY() {
        return y;
    }

    // main method (entry point)
    public static void main(String[] args) {

        // Create an object for instance methods
        InstanceStaticMethod obj = new InstanceStaticMethod();
        obj.setX(10);
        System.out.println("Instance variable X = " + obj.getX());

        // Call static methods directly via class name
        InstanceStaticMethod.setY(5);

        System.out.println("Static variable Y = " + InstanceStaticMethod.getY());
    }
}
