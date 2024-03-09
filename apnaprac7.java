import java.util.*;
public class apnaprac7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,e=0,o=0,c;

        do {
        System.out.println("Enter the set of integers : ");
        n=sc.nextInt();
            if(n%2==0){
                e += n;
            }
           else{
                o += n;
            }

            System.out.println("Do u want to continue press 1 for yes and press 0 for no");
            c=sc.nextInt();
        }while(c==1);
        System.out.println("Sum of odd numbers = "+o);
        System.out.println("Sum of even numbers = "+e);
    }
}