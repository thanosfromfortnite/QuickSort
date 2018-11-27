public class QuickSort {
/*JESSE HAN*/
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
            /*JESSE HAN*/
        }
    }
    /*JESSE HAN*/

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        /*JESSE HAN*/
        for (int j = left; j < right; j ++) {
            if (arr[j] <= pivot) {
                i ++;
                // AAAAAAAAAHHHHHHHHHHHHHHHHHHHH
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        } /*JESSE HAN MADE THIS AND NOT JACKIE WU OR ANYBODY ELSE*/
        int x = arr[i + 1]; arr[i + 1] = arr[right]; arr[right] = x;
        return i + 1;
    }
}
