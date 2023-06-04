
package sorting;

public class
SortingAlgorithms {

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // TODO: Implement insertion sort algorithm and store the sorted array in the `insertion_sort` table in the database.

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        // TODO: Implement bubble sort algorithm and store the sorted array in the `bubble_sort` table in the database.

        return array;
    }

    public int[] mergeSort(int[] array) {
        // TODO: Implement merge sort algorithm and store the sorted array in the `merge_sort` table in the database.

        return array;
    }

    public int[] quickSort(int[] array) {
        // TODO: Implement quick sort algorithm and store the sorted array in the `quick_sort` table in the database.

        return array;
    }

    public int[] heapSort(int[] array) {
        // TODO: Implement heap sort algorithm and store the sorted array in the `heap_sort` table in the database.

        return array;
    }

    public int[] bucketSort(int[] array) {
        // TODO: Implement bucket sort algorithm and store the sorted array in the `bucket_sort` table in the database.

        return array;
    }

    public int[] shellSort(int[] array) {
        // TODO: Implement shell sort algorithm and store the sorted array in the `shell_sort` table in the database.

        return array;
    }
}
