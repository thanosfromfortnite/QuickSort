public class Runner {

    public static void main(String[] args) {
        int[] array = {3, 345, 123, 6, 234, 69, 33, 12};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        QuickSort.quickSort(array, 0, 6);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
