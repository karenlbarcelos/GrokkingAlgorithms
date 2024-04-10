package org.example.Chapter1.SelectionSort;

public class SelectionSort {

    public static int findSmallestIndex(int[] arr) {
        int smallestIndex = 0;
        int smallestValue = arr[0]; // Initialize with first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestValue) {
                smallestValue = arr[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length]; // Create a new array for sorted elements

        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = findSmallestIndex(arr);
            newArr[i] = arr[smallestIndex];  // Extract smallest element
            arr = removeElement(arr, smallestIndex); // Remove it from original array
        }

        return newArr;
    }

    private static int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];  // Adjusted size for removal
        System.arraycopy(arr, 0, newArr, 0, index); // Copy elements before index
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1); // Copy elements after index
        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2, 10};
        int smallestIndex = findSmallestIndex(array);
        System.out.println("O menor elemento está no índice: " + smallestIndex);

        System.out.println(selectionSort(array));
    }
}
