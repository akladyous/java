package com.practice.oop_principles.inheritance.hybrid;

class GrandFather {
    public void granFatherMethod() {
        System.out.println("I am grandfather.");
    }
}

//inherits GrandFather properties
class Father extends GrandFather {
    public void fatherMethod() {
        System.out.println("I am father.");
    }
}

//inherits Father properties
class Son extends Father {
    public void sonMethod() {
        System.out.println("I am son.");
    }
}

//inherits Father properties
class Daughter extends Father {
    public void daughterMethod() {
        System.out.println("I am a daughter.");
    }

    public static void main(String args[]) {
        Daughter obj = new Daughter();
        obj.daughterMethod();
        obj.fatherMethod();
        obj.granFatherMethod();
    }
}