package me.ffkeff;

import java.util.Arrays;

public class TestLinSort {
    public static void main(String[] args){
        int[] array = {7, 3, 5, 2, 4, 1, 6};
        int[] tmp = Arrays.copyOf(array,7);

        LinSort.sortMSD(tmp);
        for (int num : tmp) {
            System.out.print(num + " ");
        }
        System.out.println();

        tmp = Arrays.copyOf(array,7);
        LinSort.sortLSD(tmp);
        for (int num : tmp) {
            System.out.print(num + " ");
        }
        System.out.println();

        tmp = Arrays.copyOf(array,7);
        LinSort.countingSort(tmp);
        for (int num : tmp) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
