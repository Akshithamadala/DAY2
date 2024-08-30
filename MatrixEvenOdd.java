import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatrixEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] matrix = new int[size];

        // Input elements of the matrix
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            matrix[i] = sc.nextInt();
        }

        // Separate even and odd indexed elements into two lists
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                evenList.add(matrix[i]); // Even index
            } else {
                oddList.add(matrix[i]); // Odd index
            }
        }

        // Sort both lists
        Collections.sort(evenList);
        Collections.sort(oddList);

        // Find the second-largest element from both lists
        int secondLargestEven = evenList.size() > 1 ? evenList.get(evenList.size() - 2) : evenList.get(0);
        int secondLargestOdd = oddList.size() > 1 ? oddList.get(oddList.size() - 2) : oddList.get(0);

        // Sum of the second-largest numbers
        int sum = secondLargestEven + secondLargestOdd;

        // Print results
        System.out.print("Sorted even array: ");
        for (int num : evenList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Sorted odd array: ");
        for (int num : oddList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Sum = " + sum);
    }
}

