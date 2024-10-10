package ie.atu.arrays;

public class DefaultValues {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];
        char[] charArray = new char[4];

        System.out.println("Default int values:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nDefault boolean values:");
        for (boolean bool : boolArray) {
            System.out.print(bool + " ");
        }

        System.out.println("\nDefault String values:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

        System.out.println("\nDefault Char values:");
        for (char chr : charArray) {
            System.out.print(chr + " ");
        }
    }
}
