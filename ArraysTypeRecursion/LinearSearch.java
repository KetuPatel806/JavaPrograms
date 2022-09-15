package ArraysTypeRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,4,3,5,5};
        System.out.println(find(arr,6,0));
        System.out.println(findIndex(arr,4,0));
        findAllIndex(arr,4,0);
        System.out.println(list);
        ArrayList<Integer> ans = findAllIndexArrayList(arr,5,0,new ArrayList<>());
        System.out.println(ans);
        findAllIndexArrayList2(arr,4,0);
        System.out.println(list);
    }
    public static boolean find(int[] arr,int target ,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    public static int findIndex(int[] arr,int target,int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length) {
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndexArrayList(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexArrayList(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAllIndexArrayList2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> takeAllMyNumbers =  findAllIndexArrayList2(arr,target,index+1);

        list.addAll(takeAllMyNumbers);

        return list;
    }
}
