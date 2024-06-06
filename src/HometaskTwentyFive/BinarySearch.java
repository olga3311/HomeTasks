package HometaskTwentyFive;

public class BinarySearch {
    public static int binarySearch(int[] array, int number, int start, int finish) {
        int index = -1;

        int median = (start + finish) / 2;

        if (array[median] == number) {
            index = median;
        }

        if (start == finish && array[median] != number) {
            return -1;
        }

        if (array[median] > number) {
            index = binarySearch(array, number, start, median - 1);
        }

        if (array[median] < number) {
            index = binarySearch(array, number, median + 1, finish);
        }

        return index;
    }

}
