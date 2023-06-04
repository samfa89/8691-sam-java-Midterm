package sorting;

import org.testng.Assert;

public class UnitTestSorting {

    public static void main(String[] args) {
        // Define the unsorted and sorted arrays for validation
        int[] unsortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create an instance of the SortingAlgorithms class
        SortingAlgorithms sorting = new SortingAlgorithms();

        // Perform unit tests for each sorting algorithm
        testSortingAlgorithm(sorting::selectionSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::insertionSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::bubbleSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::mergeSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::quickSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::heapSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::bucketSort, unsortedArray, sortedArray);
        testSortingAlgorithm(sorting::shellSort, unsortedArray, sortedArray);
    }

    /**
     * Performs a unit test for a sorting algorithm.
     *
     * @param sortingAlgorithm The sorting algorithm to test.
     * @param unsortedArray    The unsorted array to pass to the sorting algorithm.
     * @param sortedArray      The expected sorted array.
     */
    private static void testSortingAlgorithm(SortingAlgorithm sortingAlgorithm, int[] unsortedArray, int[] sortedArray) {
        int[] actualSortedArray = sortingAlgorithm.sort(unsortedArray);
        Assert.assertEquals(actualSortedArray, sortedArray, "ARRAY IS NOT SORTED... YET!");
    }

    /**
     * Functional interface for a sorting algorithm.
     */
    @FunctionalInterface
    private interface SortingAlgorithm {
        int[] sort(int[] array);
    }
}
