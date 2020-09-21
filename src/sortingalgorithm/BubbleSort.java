package sortingalgorithm;

/**
 * 冒泡排序， 每一轮排序都依次比较相邻两个位置的数据，把大的放在后面。
 * 时间复杂度O(n^2), 空间复杂度O(1)。
 */
public class BubbleSort {
    public int[] bubbleSort(int arr[]) {
        if(arr == null || arr.length == 0) return arr;

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - 1 - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}