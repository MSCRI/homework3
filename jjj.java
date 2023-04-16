package untitled;

import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            System.out.print("Enter m: ");
            int m = scanner.nextInt();
            while (n >= m) {
                n -= m;
            }
            System.out.println("The remainder of n divided by m is " + n);
        }
    }
}
