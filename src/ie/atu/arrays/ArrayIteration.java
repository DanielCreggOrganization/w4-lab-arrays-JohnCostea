package ie.atu.arrays;

public class ArrayIteration {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        // Accessing elements by index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Iterating using traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Iterating using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        //printing in reverse order
        for (int i=numbers.length-1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
