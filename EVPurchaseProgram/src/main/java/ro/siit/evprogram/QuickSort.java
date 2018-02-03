package ro.siit.evprogram;

public class QuickSort<T extends Comparable<T>> {
    public T[] array;

    /**
     * method for sorting an array
     */
    public void sort() {
        int left = 0;
        int right = array.length - 1;
        quicksort(0, array.length - 1);
    }

    /**
     * method for sorting an array by using the quick sort algorithm
     *
     * @param left  is the left end of the array
     * @param right is the right end of the array
     */
    public void quicksort(int left, int right) {
        if (left >= right) {
            return;
        }

        T pivot = getMedian(left, right);
        int partition = partition(left, right, pivot);
        quicksort(0, partition - 1);
        quicksort(partition + 1, right);
    }

    /**
     * method that takes an element from the array as a pivot and places elements that are smaller than the pivot to the left of the pivot and the elements that are greater to the right
     *
     * @param left
     * @param right
     * @param pivot
     * @return
     */
    private int partition(int left, int right, T pivot) {
        int l = left - 1;
        int r = right;
        while (l < r) {
            while (((Comparable<T>) array[++l]).compareTo(pivot) < 0) ;
            while (r > 0 && ((Comparable<T>) array[--r]).compareTo(pivot) > 0) ;
            if (l >= r) {
                break;
            } else {
                swap(l, r);
            }
        }
        swap(l, right);
        return l;
    }

    public T getMedian(int left, int right) {
        int center = (left + right) / 2;
        if (((Comparable<T>) array[left]).compareTo(array[center]) > 0)
            swap(left, center);
        if (((Comparable<T>) array[left]).compareTo(array[right]) > 0)
            swap(left, right);
        if (((Comparable<T>) array[center]).compareTo(array[right]) > 0)
            swap(center, right);
        swap(center, right);
        return array[right];
    }

    /**
     * method for swapping the values
     *
     * @param left
     * @param right
     */
    private void swap(int left, int right) {
        T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public void printArray() {
        for (T t : array) {
            System.out.println(t + " ");
        }
    }
}