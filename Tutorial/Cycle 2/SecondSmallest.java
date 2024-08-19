import java.util.*;

class SecondSmallestElement {

    int findSecondSmallest(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return -1 if second smallest cannot be found.
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements might be the same).");
            return -1;
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        SecondSmallestElement sse = new SecondSmallestElement();
        int secondSmallest = sse.findSecondSmallest(arr, n);

        if (secondSmallest != -1) {
            System.out.println("The second smallest element is: " + secondSmallest);
        }

        s.close();
    }
}

