import java.util.*;
public class apnaprac6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Income : ");
        int income=sc.nextInt();
        int tax;

        if(income <= 500000){
            tax=0;
        }
        else if(income <= 800000){
            tax= (int) (income * 0.2);
        }else{
            tax= (int) (income * 0.3);
        }
        System.out.println("Your IncomeTax = "+tax);
    }
}