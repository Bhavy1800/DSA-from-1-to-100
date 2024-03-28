import java.util.*;
public class BasicFunc {
    public static void prinHello(){
        System.out.println("Hello Bhavy from Java Function");
    }
    public static int calculateSum(int num1,  int num2){//Parameters or formal parameters and called when function definition

        int sum = num1 + num2;
    return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);//Arguments or actual parameters and called when function calling
        System.out.println("Sum of num1 and num2 is "+sum);
    }


}
