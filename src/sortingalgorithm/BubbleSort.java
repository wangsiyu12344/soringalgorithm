package sortingalgorithm;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int [] bubbleSort(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
