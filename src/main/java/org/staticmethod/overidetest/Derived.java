package org.staticmethod.overidetest;

public class Derived  extends Parent {
    public static void main(String[] args) {

//        1. static method can be accessed with the help of object as well, same behaviour.
//        2. Derived class can access the static method created in parent class just like parent class
        Parent.test2();
        Derived.test2();

        //suppose there is a static test method in parent class and Derived class creates similar method with same signature and name, then we
        // can not say that method is overriden, it is just method hiding, now Derived class will call its own copy, there would be nothing like
        //dynamic method dispatch, if test was a normal method in place of static then there would be dynamic method dispatch.

        Parent p = new Parent(); p.test();
        Parent p1 = new Derived(); p1.test();//no dynamic method dispatch

        //now derived will call its own copy instead of the parent one.
        Derived d = new Derived(); d.test();

    }

    public static void test() {
        System.out.println("Derived static test method********************************************************");
    }
}

