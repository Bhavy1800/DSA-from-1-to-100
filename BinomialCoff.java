import java.util.*;
public class BinomialCoff {
    public static int fac_n(int n){
        int f1=1;
        for(int i=1;i<=n;i++){
            f1=f1*i;
        }
        return f1;
    }
    public static int fac_r(int r){
        int f2=1;
        for(int i=1;i<=r;i++){
            f2=f2*i;
        }
        return f2;
    }
    public static int fac_nMinusR(int n){
        int f3=1;
        for(int i=1;i<=n;i++){
            f3=f3*i;
        }
        return f3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");  
        int n = sc.nextInt();
        System.out.println("Enter the value of r = ");
        int r = sc.nextInt();
        int nMinusr = n-r;
        int binomial_cofficient = fac_n(n)/(fac_r(r)*fac_nMinusR(nMinusr));
        System.out.println("Value of Binomial Coefficient = "+binomial_cofficient);
    }
}
