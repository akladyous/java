package com.practice.oop_principles.inheritance.hierarchy;

class HierarchicalInheritanceExample {
    public static void main(String args[]) {
        Science science = new Science();
        Commerce commerce = new Commerce();
        Arts art = new Arts();

        science.methodStudent();
        science.methodScience();

        commerce.methodStudent();
        commerce.methodCommerce();

        art.methodStudent();
        art.methodStudent();
    }
}

class Student {
    public void methodStudent() {
        System.out.println("The method of the class Student invoked.");
    }
}

class Science extends Student {
    public void methodScience() {
        System.out.println("The method of the class Science invoked.");
    }
}

class Commerce extends Student {
    public void methodCommerce() {
        System.out.println("The method of the class Commerce invoked.");
    }
}

class Arts extends Student {
    public void methodArts() {
        System.out.println("The method of the class Arts invoked.");
    }
}

