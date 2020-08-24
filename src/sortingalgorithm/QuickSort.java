package sortingalgorithm;

import java.util.Arrays;

/**
 * 快速排序:通过一趟排序将待排记录分隔成独立的两部分，
 * 其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序
 * 时间复杂度和递归程度有关，最优递归logn次，即为O(nlogn)；最差递归n次，即为O(n^2)。
 */
public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int pivot = arr[left];  //以最左边的值作为基准值。
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当i和j相遇时，和pivot交换
        int temp = arr[i];
        arr[i] = pivot;
        arr[left] = temp;
        quickSort(arr, j + 1, right);
        quickSort(arr, left, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 8, 32, 16};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
