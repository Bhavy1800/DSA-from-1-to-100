import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income;
        float tax;

        System.out.println("Enter your income : ");
        income = sc.nextInt();

        if(income < 500000){
            tax = 0;
            System.out.println("Your income tax : " + (500000 * 0));
        } else if (income > 500000 && income < 1000000) {
            tax = 0.20F;
            System.out.println("Your income tax : " + (500000 * 0.20));
        } else if (income > 1000000) {
            tax = 0.30F;
            System.out.println("Your income tax : " + (500000 * 0.30));
        }


    }
}
