// Write a Java program to multiply two binary numbers
import java.util.*;

public class binary_mul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String b1 = sc.next();
        String b2 = sc.next();

        int n1 = 0;
        int n2 = 0;

        // binary 1 → decimal
        for (int i = 0; i < b1.length(); i++) {
            if (b1.charAt(i) == '1')
                n1 = n1 * 2 + 1;
            else
                n1 = n1 * 2;
        }

        // binary 2 → decimal
        for (int i = 0; i < b2.length(); i++) {
            if (b2.charAt(i) == '1')
                n2 = n2 * 2 + 1;
            else
                n2 = n2 * 2;
        }

        int product = n1 * n2;

        System.out.println("Mul:"+Integer.toBinaryString(product));
    }
}
