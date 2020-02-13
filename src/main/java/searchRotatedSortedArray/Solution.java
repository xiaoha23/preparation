package searchRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int endindex = nums.length -1;
        if(nums[0] == target)
            return 0;
        if (nums[endindex] == target)
            return endindex;
        int middleIndex = nums.length / 2;
        if (nums[0] < target && target < nums[middleIndex]){
            //repeat, start index = 0, end index = middleIndex
        } else {
//            repeat, start index = middleIndex + 1, end index = end index
        }

        return 0;
    }


}
