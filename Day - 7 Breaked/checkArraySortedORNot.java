public class checkArraySortedORNot {
    
    // public static boolean isSorted = true;

    public static boolean checkArraySorted(int[] arr, int idx) {
        
        boolean isSorted = true;

        if(idx == arr.length) {
            return isSorted;
        }
        
        if(arr[idx] < arr[idx-1]) {
            isSorted = false;
            return isSorted;
        }

        return checkArraySorted(arr, idx+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        
        if (checkArraySorted(arr, 1)) {
            System.out.println("Array Is SORTED");
        } else {
            System.out.println("Array Isn't SORTED");
        }


    }    
}
