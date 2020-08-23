package sortingalgorithm;

/**
 * 插入排序：时间复杂度： O(n), 空间复杂度O(1)。
 */
public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return arr;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i;
            while (j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j != i){
                arr[j] = temp;
            }

        }
        return arr;
    }
}
