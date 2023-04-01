package com.practice.oop_principles.inheritance.hybrid;
class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        b1.b(); b1.a();
        A b2 = new B();

    }
}

class A {
    void a(){};
}
class B extends  A {
    void b(){};
}
class C extends A {
    void c(){};
}
class D extends A {
    void d(){};
}
