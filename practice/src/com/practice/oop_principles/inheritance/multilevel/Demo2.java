package com.practice.oop_principles.inheritance.multilevel;
class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.methodA();
        b.methodB();
        D d = new D();
        d.methodA();
        d.methodB();
        d.methodC();
        d.methodD();

    }
}

class A {
    void methodA(){};
}
class B extends  A {
    void methodB(){};
}
class C extends B {
    void methodC(){};
}
class D extends C {
    void methodD(){};
}

