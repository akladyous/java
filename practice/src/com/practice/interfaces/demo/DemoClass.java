package com.practice.interfaces.demo;

public class DemoClass implements DemoInterface{

    @Override
    public void abstractMethod() {
        System.out.println("1- Public Abstract Method");
    }

    public static void main(String[] args) {
        System.out.println("all interface methods are by default : public");
        System.out.println("All interface fields  are by default : " + DemoInterface.fieldString);
        System.out.println("The interface body can contain:\n1-abstract methods, \n2-default methods, \n3-and static methods.");
        System.out.println("-".repeat(50));
        System.out.println("invoking methods : ");
        DemoClass demo = new DemoClass();
        demo.abstractMethod();
        demo.defaultMethod();
        DemoInterface.StaticMethod();
        System.out.println("-".repeat(50));
        System.out.println("'Defining Private Methods in Interfaces'\nPrivate methods can be implemented static or non-static.");
        System.out.println("This means that in an interface we are able to create private methods to encapsulate code from both default and static public method signatures");

    }
}
