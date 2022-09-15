package ArraysTypeRecursion;

public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,17,8};
        System.out.println(Sorted(arr,0));
    }
    public static boolean Sorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && Sorted(arr,index+1);
    }
}
