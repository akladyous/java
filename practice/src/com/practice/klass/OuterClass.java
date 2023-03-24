package com.practice.klass;


import jdk.dynalink.beans.StaticClass;

public class OuterClass {

    class InnerCalsss {
        int x = 0;
        static int y;
        public int getX() {
            return x;
        }
    }


//    InnerCalsss xInstance = new InnerCalsss();
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerCalsss innerObject = outerClass.new InnerCalsss();
        System.out.println(innerObject.getX());

    }
}
