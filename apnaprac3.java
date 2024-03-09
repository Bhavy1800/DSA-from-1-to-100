import java.util.*;

public class apnaprac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d, f;

        System.out.println("Enter the cost of pen : ");
        a = sc.nextFloat();
        System.out.println("Enter the cost of pencil : ");
        b = sc.nextFloat();
        System.out.println("Enter the cost of eraser : ");
        c = sc.nextFloat();

        d = (a + b + c);
        System.out.println("Total Cost of 3 Items : " + d);

        float e = (18 * d) / 100;
        System.out.println("Total includes GST : " + (e + d));

    }
}
