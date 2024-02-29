import java.util.*;
public class Loops {
    public static void main(String[] args) {

        //----while loop----
        int counter = 0;
        while (counter < 100){
            System.out.println("Hello World from bhavy patel!");
            counter++;
        }

        //Print number from 1 to 10
        int num = 1;
        while (num <=10){
            System.out.println(num);
            num++;
        }

        //Print number from 1 to n
        int numb = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        while (numb <=n){
            System.out.println(numb);
            numb++;
        }

        //Print sum of n natural numbers
        int sum = 0;

        System.out.println("Enter a number to sum = ");
        int n1 = sc.nextInt();
        int nb = 1;
        int Sum = 0;

        while(nb<=n1){
            sum = sum+nb;
            nb++;
        }
        System.out.println(sum);

        //----for loop----
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");

        //Print square pattern
        for(int i=1;i<=10;i++){
            System.out.println("****");
        }

        //Print revrese of a number
        int strnum = 12345;
        int lastdigit;
        while(strnum > 0){
            lastdigit = strnum % 10;
            strnum = strnum /10;
            System.out.print(lastdigit);
        }

        // reverse a given number
        int nn = 10899;
        int rev = 0;
        while (nn>0){
            int laastdigit = nn%10;

            rev = (rev*10) +laastdigit;
            nn = nn /10;
        }
        System.out.println("reverse number is " + rev);





    }
}
