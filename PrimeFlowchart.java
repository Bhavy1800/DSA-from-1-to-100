public class PrimeFlowchart {
    public static void main(String args[]){
        int n = 3;
        int div = 2;
        while(div < n){

            if(n % div == 0){
                System.out.println("Not Prime Number");
                System. exit(0);
            }
            else{
                div = div + 1;
                System.out.println("Prime Number");
            }

        }
    }

}
