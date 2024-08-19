import java.util.*;

public class MultiplicationTable {

    static void printMultiplicationTable(int number, int range) {
        System.out.println("Multiplication table for " + number);
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        printMultiplicationTable(number, range);

        scanner.close();
    }
}

