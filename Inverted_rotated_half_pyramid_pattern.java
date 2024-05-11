
import java.util.*;
public class Inverted_rotated_half_pyramid_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {

            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
