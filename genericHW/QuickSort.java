public class QuickSort implements ISort {
    ISortingOrder order;
    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        order = sorting;
        quickSort(vector, 0, vector.length-1);
    }


    public <T extends Comparable<T>> void quickSort(T[] vector, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(vector, begin, end);
    
            quickSort(vector, begin, partitionIndex-1);
            quickSort(vector, partitionIndex+1, end);
        }
    }

    private <T extends Comparable<T>> int partition(T[] vector, int begin, int end) {
        T pivot = vector[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (order.compare(vector[j], pivot) < 0) {
                i++;
    
                T swapTemp = vector[i];
                vector[i] = vector[j];
                vector[j] = swapTemp;
            }
        }
    
        T swapTemp = vector[i+1];
        vector[i+1] = vector[end];
        vector[end] = swapTemp;
    
        return i+1;
    }
}
