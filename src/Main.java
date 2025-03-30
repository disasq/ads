import java.util.Scanner;

public class Main {

    // 1. Find minimum value in array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // 2. Calculate average of array elements
    public static double findAverage(int[] arr, int len) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / len;
    }

    // 3. Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 4. Calculate factorial using recursion
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 5. Calculate Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 6. Calculate power a^n using recursion
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // 7. Print array in reverse using recursion
    public static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }

    // 8. Check if string contains only digits using recursion
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    // 9. Calculate binomial coefficient using recursion
    public static int combi(int n, int k) {
        if (k == 0 || k == n) return 1;
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }

    // 10. Calculate GCD using Euclidean Algorithm (recursion)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Task 1
        System.out.println("--- Task 1: Find Minimum ---");
        int len1 = in.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Min: " + findMin(arr1));

        // Task 2
        System.out.println("--- Task 2: Find Average ---");
        int len2 = in.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println("Average: " + findAverage(arr2, len2));

        // Task 3
        System.out.println("--- Task 3: Check Prime ---");
        int n1 = in.nextInt();
        System.out.println(n1 + " is " + (isPrime(n1) ? "Prime" : "Composite"));

        // Task 4
        System.out.println("--- Task 4: Factorial ---");
        int n2 = in.nextInt();
        System.out.println(n2 + "! = " + factorial(n2));

        // Task 5
        System.out.println("--- Task 5: Fibonacci ---");
        int n3 = in.nextInt();
        System.out.println("Fibonacci(" + n3 + ") = " + fibonacci(n3));

        // Task 6
        System.out.println("--- Task 6: Power a^n ---");
        int base = in.nextInt();
        int exponent = in.nextInt();
        System.out.printf("%d^%d = %d\n", base, exponent, power(base, exponent));

        // Task 7
        System.out.println("--- Task 7: Reverse Array ---");
        int len3 = in.nextInt();
        int[] arr3 = new int[len3];
        for (int i = 0; i < len3; i++) {
            arr3[i] = in.nextInt();
        }
        System.out.print("Reversed: ");
        reversePrint(arr3, len3 - 1);
        System.out.println();

        // Task 8
        System.out.println("--- Task 8: Check if String is All Digits ---");
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(s1 + " is " + (isAllDigits(s1, 0) ? "All digits" : "Contains non-digit"));
        System.out.println(s2 + " is " + (isAllDigits(s2, 0) ? "All digits" : "Contains non-digit"));

        // Task 9
        System.out.println("--- Task 9: Binomial Coefficient ---");
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.printf("C(%d,%d) = %d\n", n, k, combi(n, k));

        // Task 10
        System.out.println("--- Task 10: GCD ---");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("GCD(%d,%d) = %d\n", a, b, gcd(a, b));
    }
}
