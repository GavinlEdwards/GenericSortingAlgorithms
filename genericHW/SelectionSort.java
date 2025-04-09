public class SelectionSort extends Sort {

    
    
    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        T lowest;
        int lowestIndex;
        for(int i = 0; i<vector.length-1; i++) {
            lowest = vector[i];
            lowestIndex = i;
            for(int j = i; j<vector.length;j++) {
                // finds max or min
                if (sorting.compare(vector[j], lowest) < 0) {
                    lowest = vector[j];
                    lowestIndex = j;
                }
            
            }
            if(i != lowestIndex) {
                swap(vector, i, lowestIndex);
            }
        }
        
    }

}
