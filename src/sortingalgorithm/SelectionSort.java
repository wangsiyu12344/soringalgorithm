package sortingalgorithm;

/**
 * 选择排序
 * 首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
 * 其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。
 * 时间复杂度O(n^2), 空间复杂度O(1)。
 */
public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) return arr;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
