package me.ffkeff;

public class LinSort {
    private static int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
    public static void sortMSD(int[] array) {
        int max = getMax(array);
        int length = array.length;
        int[] temp = new int[length];
        int position = 1;
        while (max / position > 0) {
            int[] count = new int[10];
            for (int num : array) {
                count[(num / position) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = length - 1; i >= 0; i--) {
                temp[--count[(array[i] / position) % 10]] = array[i];
            }

            System.arraycopy(temp, 0, array, 0, length);
            position *= 10;
        }
    }


    private static int getMaxNumberLength(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return String.valueOf(max).length();
    }


    public static void sortLSD(int[] array) {
        int maxLength = getMaxNumberLength(array);
        int length = array.length;
        int[] temp = new int[length];
        int position = 1;
        while (maxLength > 0) {
            int[] count = new int[10];
            for (int num : array) {
                count[(num / position) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = length - 1; i >= 0; i--) {
                temp[--count[(array[i] / position) % 10]] = array[i];
            }

            System.arraycopy(temp, 0, array, 0, length);
            position *= 10;
            maxLength--;
        }
    }

    public static void countingSort(int[] array) {
        int length = array.length;
        int[] sortedArray = new int[length];
        int max = getMax(array);
        int min = getMin(array);
        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : array) {
            count[num - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            sortedArray[--count[array[i] - min]] = array[i];
        }

        System.arraycopy(sortedArray, 0, array, 0, length);
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
}
