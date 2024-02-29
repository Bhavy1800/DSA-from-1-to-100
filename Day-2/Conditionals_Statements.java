import java.util.*;
public class Conditionals_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IF-ELSE
        int age = 22;
        if(age > 18){
            System.out.println("You are adult");
        }else{
            System.out.println("You are not an adult");
        }

        //Print the largest of two numbers
        int num1 = 10, num2 = 20;
        if(num1>num2){
            System.out.println("Number 1 is largest number");
        }else{
            System.out.println("Number 2 is largest number");
        }

        //Print if number is Odd or Even
        int n1=5;
        if(n1 % 2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        //ELSE IF
        int total = 80;
        if (total > 90){
            System.out.println("You have A grade");
        } else if (total > 75) {
            System.out.println("You have B grade");
        } else if (total > 65) {
            System.out.println("You have C grade");
        } else if (total > 50) {
            System.out.println("You have D grade");
        } else if (total >33) {
            System.out.println("You have passing grade");
        }else {
            System.out.println("You are fail");
        }

        //Ternary Operator
        int numberr = 8;
        String type = ((numberr%2)==0)?"even":"odd";
        System.out.println(type);

        //Switch-Case
        int num = 2;
        switch(num){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Vadapav");
                break;
            case 3:
                System.out.println("Dabeli");
                break;
            default:
                System.out.println("we realize we are dreaming");
        }



    }
}
