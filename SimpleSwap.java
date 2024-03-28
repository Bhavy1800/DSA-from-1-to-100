import java.util.Scanner;

public class SimpleSwap {
    public static void Swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
// java is using call by value
            int a = 4;
            int b = 5;

            //Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // for function
        Swap(10,20);


    }
}
