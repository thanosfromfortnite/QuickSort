public class Runner {
    /*JESSE HAN*/
    public static void main(String[] args) {
        int[] array = {3, 345, 123, 6, 234, 69, 33, 12};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*JESSE HAN MADE IT*/
        QuickSort.quickSort(array, 0, 7);
        System.out.println("Sorted!");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } /*always tip your favorite halal cart*/
    }
}
