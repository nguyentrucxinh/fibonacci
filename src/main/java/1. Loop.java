import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xinhnguyen on 29/07/2017.
 */
public class Loop {

    public static void main(String[] args) {

        System.out.println("----- Loop -----");

        // Input length of fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of fibonacci:");
        int length = sc.nextInt();

        // List contain fibonacci
        List<Integer> list_fibo = new ArrayList<>();

        // Logic
        for (int i = 0; i < length; i++) {
            switch (i) {
                case 0:
                case 1:
                    list_fibo.add(i);
                    break;
                default:
                    list_fibo.add(list_fibo.get(i - 1) + list_fibo.get(i - 2));
                    break;
            }
        }

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
}
