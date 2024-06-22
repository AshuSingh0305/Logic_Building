//LeetCode: 238 - Product of Array Except Self
package Practice;

public class Product_Of_Array_Except_self {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        System.out.print("{");
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println("}");
    }
    public static int[] productExceptSelf(int[] nums){
        int[] left = new int[nums.length];
        left[0]=1;
        int[] right = new int[nums.length];
        right[nums.length-1] = 1;
        for(int i=1; i<nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for (int i= nums.length-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for (int i=0; i < nums.length; i++){
            right[i] = left[i]*right[i];
        }
        return right;
    }
}
