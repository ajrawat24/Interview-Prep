package coreJava;

public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;  // "this.name" = instance variable
        this.age = age;    // "age" = local parameter
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

    }

    public static void main(String[] args) {
       Student s1 = new Student("Ajay", 30);
       s1.display();
    }
}
