package Array;

public class MoveZerotoEnd {
    // Function to move zeros to the end of the array
    public static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = array[i];
                array[i] = array[nonZeroIndex];
                array[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 5, 0, 2, 0, 8, 4, 0, 1};
        moveZerosToEnd(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}