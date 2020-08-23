package sortingalgorithm;

/**
 * 优化了的冒泡排序。
 * 假如从第一个到最后一个本来就是有序的，那么就停止排序。
 */
public class OptimizedBubbleSort {
    public int[] optimizedBubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                if(flag){
                    break;
                }

            }
        }
        return arr;
    }
}
