import java.util.Scanner;

public class Day1 {
    public static void main(String args[]){
        System.out.print("Hello World");
        System.out.print("Hello \n World");
        System.out.println("Hello World");

        //output using terminal
        // for compile : javac basics.java
        // for run : java basics

        //Simple Pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables
        int a = 10;
        int b = 5;
        System.out.println("a");
        System.out.println(a);
        System.out.println("b");
        System.out.println(b);
        String name = "Bhavy Patel";
        System.out.println(name);

        a = 5;
        System.out.println(a);

        //There two types of data types and those are primitive and non-primitive
        //         Primitive :
        // byte 1byte [-128 to 127]
        //  short  2byte [     ]
        //  char 2byte ['a' to '2' 'A'-'2' '@' '%' ',']
        //  boolean 1byte true/false
        //  int 4byte  -2B - +2B
        //  long 8byte
        //  float 4byte _ . _
        //  double 8byte .
        //          Non-Primitive :
        // String
        // Array
        // Class
        // Object
        // Interface
        byte by = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        boolean var1 = false;
        float f = 10.5f;
        System.out.println(f);
        int number = 25;
        System.out.println(number);
        //long
        //double
        short n = 240;
        System.out.println(n);

    //sum of x and y
        int x = 10, y = 20;
        int sum = x + y;
        System.out.println("Sum of x and y = " + sum);

    //Inputs
        //here we have to import java.util.*;
        //next
        // nextLine for string
        // nextInt
        // nextByte
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        //sum of x and y with inputs from user
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println(x1+y1);

        //product of x1 and y1
        System.out.println(x1 * y1);

        //area of circle
        int r = sc.nextInt();
        System.out.println(3.14 * r * r);

        //Type Conversion
        //Conversion happens when : a.type compatible and b.destination type > source type
        //byte->short->int->float->long->double

        //Type Casting
        int marks = (int)(99.99f);




    }

}
