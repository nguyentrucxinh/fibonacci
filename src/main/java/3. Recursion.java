import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xinhnguyen on 29/07/2017.
 */
public class Recursion {

    public static void main(String[] args) {

        System.out.println("----- Recursion -----");

        // Input length of fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of fibonacci:");
        length = sc.nextInt();

        // List contain fibonacci
        list_fibo = new ArrayList<>();

        // Logic
        fibo(0);

        // Print
        System.out.println("Fibonacci is:");
        System.out.println(list_fibo);

        // Summary
        int sum = 0;
        for(int value : list_fibo)
            sum += value;
        System.out.println("Summary:");
        System.out.println(sum);
    }

    private static int n1 = 0;
    private static int n2 = 1;
    private static int length = 0;
    private static List<Integer> list_fibo;

    private static void fibo(int num) {
        if (num < length) {
            switch (num) {
                case 0:
                case 1:
                    list_fibo.add(num);
                    num++;
                    fibo(num);
                    break;
                default:
                    int next = n1 + n2;
                    list_fibo.add(next);
                    n1 = n2;
                    n2 = next;
                    num++;
                    fibo(num);
                    break;
            }
        }
    }
}
