import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        int[] numbers = new int[numElements];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input numbers:");
        for (int i = 0; i < numElements; i++) {
            System.out.println(numbers[i]);
        }
        scanner.close();
    }
}
