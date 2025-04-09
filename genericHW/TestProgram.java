public class TestProgram {

    private static <T> String vectorToString(String text, T[] vector) {
        String output = text + " {";

        for (int i=0; i<vector.length; i++) {
            output = output + vector[i] + ((i < vector.length - 1) ? ", " : "");
        }
        
        output = output + "} \n";

        return output;
    }

    public static void main(String[] args) {
        
        ISortingOrder order = new AscendingOrder();
        ISortingOrder orderDown = new DescendingOrder();



        Integer [] integers = {3, 11, 1, 5, 9, 10, 15, 25, 2, 8, 7, 13, 6, 4, 30};
        Double [] decimals = {3.5, 11.0, 1.5, 5.75, 9.0, 10.5, 15.0, 25.5, 2.25, 8.5, 7.0, 13.5, 6.25, 4.0, 30.5};
        Integer [] integers2 = {3, 11, 1, 5, 9, 10, 15, 25, 2, 8, 7, 13, 6, 4, 30};
        Double [] decimals2 = {3.5, 11.0, 1.5, 5.75, 9.0, 10.5, 15.0, 25.5, 2.25, 8.5, 7.0, 13.5, 6.25, 4.0, 30.5};
        Integer [] integers3 = {3, 11, 1, 5, 9, 10, 15, 25, 2, 8, 7, 13, 6, 4, 30};
        Double [] decimals3 = {3.5, 11.0, 1.5, 5.75, 9.0, 10.5, 15.0, 25.5, 2.25, 8.5, 7.0, 13.5, 6.25, 4.0, 30.5};
        String [] words = {"First", "ladies", "rule", "the", "State", "and", "state", "the", "rule", "ladies", "first"};
        
        System.out.println(vectorToString("Numbers   ", integers));
        SelectionSort sort1 = new SelectionSort();
        MergeSort sort2 = new MergeSort();
        QuickSort sort3 = new QuickSort();
        
        sort1.sort(integers, orderDown);
        System.out.println(vectorToString("Selection Sort Integers  ", integers));
        sort1.sort(decimals, orderDown);
        System.out.println(vectorToString("Selection Sort decimals  ", decimals));
        
        

        sort2.sort(integers2, orderDown);
        System.out.println(vectorToString("Merge Sort Integers  ", integers));
        sort2.sort(decimals2, orderDown);
        System.out.println(vectorToString("Merge Sort decimals  ", decimals));
        
        sort3.sort(integers3, orderDown);
        System.out.println(vectorToString("Quick Sort Integers  ", integers));
        sort3.sort(decimals3, orderDown);
        System.out.println(vectorToString("Quick Sort decimals  ", decimals));


    }

}
