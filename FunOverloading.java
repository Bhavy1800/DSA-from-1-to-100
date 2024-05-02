public class FunOverloading {
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;

    }
    public static float sum(float a, float b){
        return a + b ;
    }
    public static void main(String[] args) {
        //Function overloading using parameters
        System.out.println("Sum of a and b = "+sum(1,2));
        System.out.println("Sum of a, b and c = "+sum(1, 2, 3));

        //Function overloading using Data Types
        System.out.println("Sum of a and b = "+sum(1,2));
        System.out.println("Sum of a, b and c = "+sum(1.2f, 2.6f));

    }
}
