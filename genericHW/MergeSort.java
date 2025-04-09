

public class MergeSort implements ISort {

    ISortingOrder order;

    
    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        order = sorting;
        T[] vector2 = mergeSort(vector, vector.length);
        for(int i = 0; i<vector.length; i++) {
            vector[i] = vector2[i];
        }
    }

 
    public <T extends Comparable<T>> T[] mergeSort(T[] vector, int length) {
        
        if(length < 2 ) {
            return vector; 
        } 

        int mid = length/2;
        @SuppressWarnings("unchecked")
        T[] l = (T[]) new Comparable[mid];
        @SuppressWarnings("unchecked")
        T[] r = (T[]) new Comparable[length-mid];
        int leftLength = 0;
        int rightLength = 0;
        for(int i = 0; i<mid; i++) {
            l[i] = vector[i];
            leftLength++;
        }
        for(int i = mid; i< length; i++) {
            r[i- mid] = vector[i];
            rightLength++;
        }
        
        l = mergeSort(l, leftLength);
        r = mergeSort(r, rightLength);

        

        return merge(l, r, leftLength, rightLength);
    }

    public <T extends Comparable<T>> T[] merge(T[] left, T[] right, int leftLength, int rightLength) {
        
        @SuppressWarnings("unchecked")
        T[] vector = (T[]) new Comparable[leftLength+rightLength];
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (order.compare(left[i], right[j] ) < 0) {
                vector[k++] = left[i++];
            }
            else {
                vector[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            vector[k++] = left[i++];
        }
        while (j < rightLength) {
            vector[k++] = right[j++];
        }
        
        return vector;
    }
}
