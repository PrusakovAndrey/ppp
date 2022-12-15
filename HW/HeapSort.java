package HW;
import java.util.Arrays;

public class HeapSort {
    public static void main(String args[]) {

        int[] myArray = new int[]{1,4,2,-9,9,11110,-13};
        heapSort(myArray);
     }

    public static void heapSort(int[] arr) {
        int temp;
        int size = arr.length-1;
        for (int i = ((size+2) / 2); i >= 0; i--) {
           heapify(arr, i, size);
        };
        for(int i= size; i>=0; i--) {
           temp = arr[0];
           arr[0] = arr[size];
           arr[size] = temp;
           size--;
           heapify(arr, 0, size);
        }
        System.out.println(Arrays.toString(arr));
     }
     public static void heapify (int [] arr, int i, int heapSize) {
        int a = 2*i;
        int b = 2*i+1;
        int largestElement;
        if (a<= heapSize && arr[a] > arr[i]) {
           largestElement = a;
        } else {
           largestElement = i;
        }
        if (b <= heapSize && arr[b] > arr[largestElement]) {
           largestElement = b;
        }
        if (largestElement != i) {
           int temp = arr[i];
           arr[i] = arr[largestElement];
           arr[largestElement] = temp;
           heapify(arr, largestElement, heapSize);
       }
     }
}

