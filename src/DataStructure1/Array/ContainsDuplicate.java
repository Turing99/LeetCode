/*
Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

 Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */

package DataStructure1.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        boolean result = false;

        for (int num : nums) {
            if (!set.add(num)) {
                result = true;
            }
        }
        return result;

//       V2:

//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1])
//                return true;
//        }
//        return false;

//        V3:

//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//
//        for(int i = 0; i < nums.length; i++) {
//            min = Math.min(min, nums[i]);
//            max = Math.max(max, nums[i]);
//        }
//
//        boolean[] mark = new boolean[max - min + 1];
//
//        for(int i = 0; i < nums.length; i++) {
//            if(mark[nums[i] - min]) return true;
//            mark[nums[i] - min] = true;
//        }
//        return false;
    }



    public static void main(String[] args) {

        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(arr));
    }
}
