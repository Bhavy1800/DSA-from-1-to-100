import java.util.*;
public class ProfuctFun {
    public static int Product(int num1, int num2){
       int product = num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int b = sc.nextInt();
        int product = Product(a,b);
        System.out.println("Product of a and b is "+product);
    }
}
