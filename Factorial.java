import java.util.*;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int n = fact(num);
        System.out.println("Factorial of " + num + " is: " + n);
    }
}
