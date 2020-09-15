package Ethan;

import java.util.Scanner;

public class Functions {
    public static int a;
    public static int b;
    public static int c;

    public static Scanner s = new Scanner(System.in);

    //add two numbers
    public static void AddTwo() {
        SelectTwoNumbers();
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    //add three numbers
    public static void AddThree() {
        SelectThreeNumbers();
        int sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }

    //subtract two numbers
    public static void Sub() {
        SelectTwoNumbers();
        int diff = a - b;
        System.out.println(a + " - " + b + " = " + diff);
    }

    //multiply two numbers
    public static void MultTwo() {
        SelectTwoNumbers();
        int prod = a * b;
        System.out.println(a + " * " + b + " = " + prod);
    }

    //multiply three numbers
    public static void MultThree() {
        SelectThreeNumbers();
        int prod = a * b * c;
        System.out.println(a + " * " + b + " * " + c + " = " + prod);
    }

    //divide two numbers
    public static void Div() {
        SelectTwoNumbers();
        int quotient = a / b;
        System.out.println(a + " / " + b + " = " + quotient);
    }

    //raise the first to the power of the second
    public static void Pow() {
        SelectTwoNumbers();
        int pow = (int) Math.pow(a , b);
        System.out.println(a + " ^ " + b + " = " + pow);
    }

    //square a number
    public static void Square() {
        SelectOneNumber();
        int sq = a * a;
        System.out.println(a + " ^ 2  = " + sq);
    }

    //cube a number
    public static void Cube() {
        SelectOneNumber();
        int cube = a * a * a;
        System.out.println(a + " ^ 3  = " + cube);
    }

    //square root a number
    public static void SqRoot() {
        SelectOneNumber();
        double sqRt = Math.sqrt(a);
        System.out.println(a + " ^ 1/2 = " + sqRt);
    }

    //factorial of a number
    public static void Factorial() {
        SelectOneNumber();
        int fact = 1;
        for(int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(a + "! = " + fact);
    }

    //log base 10 of a number
    public static void Log() {
        SelectOneNumber();
        double log = Math.log10(a);
        System.out.println("log(" + a + ") = " + log);
    }

    //selecting one number
    public static void SelectOneNumber() {
        System.out.print("Enter an integer: ");
        a = s.nextInt();
    }

    //selecting two numbers
    public static void SelectTwoNumbers() {
        System.out.print("Enter an integer: ");
        a = s.nextInt();

        System.out.print("Enter a second integer: ");
        b = s.nextInt();
    }

    //selecting three numbers
    public static void SelectThreeNumbers() {
        System.out.print("Enter an integer: ");
        a = s.nextInt();

        System.out.print("Enter a second integer: ");
        b = s.nextInt();

        System.out.print("Enter a third integer: ");
        c = s.nextInt();
    }
}
