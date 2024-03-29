public class BinaryToDecimal {
    public static void bitode(int binum){
        int pow = 0;
        int decno = 0;

        while (binum>0){
            int lastDigit = binum % 10;
            decno = decno +(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binum = binum/10;
        }
        System.out.println(decno);
    }
    public static void main(String[] args) {

                bitode(101);


    }
}
