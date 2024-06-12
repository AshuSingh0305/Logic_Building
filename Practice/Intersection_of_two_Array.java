//Leetcode: 349_Intersection of two arrays
package Practice;

import java.util.HashSet;

public class Intersection_of_two_Array {
    public static void main(String[] args) {
        int nums1[] = {4,9,5,5};
        int nums2[] = {9,4,9,8,4};
        int ans[] = intersection(nums1, nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2){
            if(set.contains(i))
                set2.add(i);
        }
        int ans[] = new int[set2.size()];
        int i=0;
        for (int a : set2){
            ans[i++] = a;
        }
        return ans;
    }
}
