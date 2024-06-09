package Practice;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int [] ans =function(nums, target);
        System.out.println("[" + ans[0] + ","+ans[1]+"]");
    }

    public static int[] function(int[] nums, int target) {
        HashMap<Integer, Integer> index=new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int remainder = target - nums[i];
            if(index.containsKey(remainder)){
                return new int[]{index.get(remainder), i};
            }

            index.put(nums[i] , i);
        }
        return new int[]{};
    }
}