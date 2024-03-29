package Sorting;

import java.util.Arrays;

public class CyclicIMP {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int start, int end) {
        int temp =arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
