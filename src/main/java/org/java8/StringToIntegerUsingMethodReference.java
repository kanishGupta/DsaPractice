package org.java8;

@FunctionalInterface
interface MyInterface<A, B> {
    A convertStringToIntegerMethod(B stringVal);
}

public class StringToIntegerUsingMethodReference {

    public static void main(String[] args) {

        MyInterface<Integer, String> myInterface = Integer::valueOf;

        System.out.println("converted value : " + myInterface.convertStringToIntegerMethod("12"));
    }

}
