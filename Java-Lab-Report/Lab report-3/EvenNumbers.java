import java.util.Scanner;
import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int i = start;
        
        // Using while loop
        while (i <= end) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
            i++;
        }
        System.out.println("Even numbers using while loop: " + evenNumbers);
        // Using do-while loop
        evenNumbers.clear();
        i = start;
        do {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
            i++;
        } while (i <= end);
        
        System.out.println("Even numbers using do-while loop: " + evenNumbers);
        sc.close();
    }
}
