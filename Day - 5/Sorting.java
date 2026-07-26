import java.util.*;

public class Sorting {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};

        printArray(arr);
        
        // Bubble Sort
        // for(int i=0; i<arr.length-1; i++) {
        //     for(int j=0; j<arr.length-i-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             int temp =arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // Time Complexity = O(n^2)
        
        // Slection Sort
        // for(int i=0; i<arr.length-1; i++) {
        //     int min = i;
        //     for(int j=i+1; j<arr.length; j++) {
        //         if(arr[j] < arr[min]) {
        //             min = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[min];
        //     arr[min] = temp; 
        // }
        // Time Complexity = O(n^2)
        
        // Insertion Sort
        for(int i=0; i<arr.length; i++) {
            int n = arr[i];
            int j=i-1;

            while(j >= 0 && n < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = n;
        }

        printArray(arr);

    }
}
