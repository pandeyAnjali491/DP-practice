package assg3;

import java.util.ArrayList;
import java.util.List;

public class permutation2 {
    public static void findper(List<Integer> arr,List<Integer> com,List<List<Integer>> res){
        if(arr.size()==0){
            if(!res.contains(com)){
                res.add(new ArrayList<>(com));
            }
            return;
        }
        for(int i=0;i<arr.size();i++){
            int curr = arr.get(i);
            List<Integer>newArr = new ArrayList<>(arr);
            newArr.remove(i);
            com.add(curr);
            findper(newArr,com,res);
            com.remove(com.size() - 1);
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int ele:nums){
            arr.add(ele);
        }
        List<Integer> com = new ArrayList<>();
        findper(arr,com,res);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        List<List<Integer>> res = permuteUnique(arr);
        System.out.println(res);
    }
}
