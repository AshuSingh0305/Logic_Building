//Leetcode:26 Remove Duplicates from a sorted array
package Practice;

public class removeDuplicates {
    public int function(int[] nums) {
        int i=0;
        int j=0;
        int k=0;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                if(i==j){
                    k++;
                    j++;
                }else{
                    j++;
                }
            }else{
                i++;
                nums[i]=nums[j];
                k++;
                if(i==j){
                    j++;
                }
            }
        }
        return k;
    }
}
