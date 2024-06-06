package HometaskTwentyFive;

public class Sorting {
    public int[] selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            int minIndex = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[j];
            array[j] = temp;
        }

        return array;
    }


}
