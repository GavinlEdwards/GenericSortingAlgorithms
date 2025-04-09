public interface ISort {

    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting);
 
 }