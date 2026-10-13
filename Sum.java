import java.util.*;

public class Sum {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int n = sum(num);
        System.out.println("Sum of numbers from 1 to " + num + " is: " + n);
    }
}
