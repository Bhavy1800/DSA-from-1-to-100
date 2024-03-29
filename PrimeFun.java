import java.util.*;
public class PrimeFun {
    public static boolean isPrimeforgreatertwo(int n){
       boolean isPrime = true;
        for (int i=2; i<=n-1;i++){
            if (i%2==0){
                isPrime = false;

            }else{
                isPrime =true;

            }
        }
return isPrime;
    }
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n % i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int start,int end){
        for (int i=start;i<=end;i++){
           if (isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather number is prime or notprime : ");
        int n = sc.nextInt();
        if (isPrimeforgreatertwo(n)==true){
            System.out.println("Number is NotPrime.");
        }else {
                        System.out.println("Number is Prime.");
        }
        System.out.println(isPrime(n));

        PrimeInRange(2,20);

    }
}
