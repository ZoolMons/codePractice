package SortPractice;

import java.util.Arrays;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-23:2019
 * Des:快速排序
 */
public class QuickSort {
    public static Integer[] sort(Integer[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        Integer[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return quickSort(arr, 0, arr.length - 1);
    }

    private static Integer[] quickSort(Integer[] arr, Integer left, Integer right) {
        if (left < right) {
            Integer partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static Integer partition(Integer[] arr, Integer left, Integer right) {
        // 设定基准值（pivot）
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left++] = arr[right];
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right--] = arr[left];
            }
        }
        arr[left] = pivot;
        return left;
    }

    private static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
