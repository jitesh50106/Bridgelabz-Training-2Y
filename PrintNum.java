import java.util.*;
public class PrintNum {
    public static void print(int n) {
        if (n == 0) {
            return;
        } 
        System.out.println(n);
        print(n - 1);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        print(num);
    }
}
