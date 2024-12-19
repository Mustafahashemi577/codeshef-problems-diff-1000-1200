import java.util.Scanner;
import java.math.BigInteger;


public class EfficientPANLinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            BigInteger bigint = new BigInteger(s);
            System.out.println(bigint.mod(BigInteger.valueOf(20)));
        }
    }
}
