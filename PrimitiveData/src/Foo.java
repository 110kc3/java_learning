/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initializing Primitive Data Variables to literals
*/

public class Foo {
    public static void main(String[] args) {

        // You can set all of the numeric primitive data variables to a literal number
        // from 0 to 127.
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // boolean can only be set to true or false
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);


        long l2 = 127l;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("l2 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        byte b4 = 0b1111111;   // binary 127 prefix 0b
        System.out.println("b4 = " + b4);

        short s4 = 0177;  // octal 127 - octal prefix 0 only
        System.out.println("s4 = " + s4);

        int i4 = 0x007F; // hexidecimal 127 - hex prefix 0x
        System.out.println("i4 = " + i4);

        byte b5 = 'a';
        char c5 = 'a';
        double d5 = 'a';

        System.out.println("b5 = " + b5);
        System.out.println("c5 = " + c5);
        System.out.println("d5 = " + d5);
    }
}