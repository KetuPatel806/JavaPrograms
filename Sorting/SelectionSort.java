package Sorting;

import java.util.Arrays;
/* in this sorting
    first select the maximum element in the array by using getMax function
    after that find the lastIndex of the array
    max function to swap that two numbers and return a sorted array
    example :- arr = {2,5,4,6,1}
    lastIndex = arr.length - i - 1;
    maxIndex = amke function for that
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,5,4,6,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }

    }
    static int getMax(int[] arr,int start ,int end){
        int max = start;
        for(int i =0;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
