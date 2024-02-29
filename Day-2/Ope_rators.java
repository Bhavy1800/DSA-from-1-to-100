import java.util.*;
public class Ope_rators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //----Operators----

        //sum = a + b; in this sentense a and b is operand and + is an operator

        //Types of Operators

        //Arithmetic Operators(Binary/Unary/Ternary)
        //Binary
        int a=10,b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //Unary
        int c = 20;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        int e = 20;
        int f = e++;
        System.out.println(e);
        System.out.println(f);
        int g = 20;
        int h = --g;
        System.out.println(g);
        System.out.println(h);
        int i = 20;
        int j = i--;
        System.out.println(i);
        System.out.println(j);

        //Relatonal Operators
        int x = 10;
        int y = 10;
        int z = 20;
        System.out.println(x==y);
        System.out.println(y==z);
        System.out.println(x!=y);
        System.out.println(y!=z);
        System.out.println(y>z);
        System.out.println(y<z);
        System.out.println(y>=z);
        System.out.println(y<=z);

        //Logical Operators
        System.out.println((x>y)&&(x<y));
        System.out.println((x>y)||(x<y));
        System.out.println(!(x>y));

        //Bitwise Operators

        //Assignment Operators
        int s = 10;
        //s = s + 10; or s += 10;
        //s = s - 10; or s -= 10;
        //s = s * 10; or s *= 10;
        //s = s / 10; or s /= 10;
        System.out.println(s);



    }
}
