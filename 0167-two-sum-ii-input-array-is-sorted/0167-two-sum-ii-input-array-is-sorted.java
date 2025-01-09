class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0 ,high = nums.length-1;
        while(low<=high){
            if(nums[low]+nums[high]==target){
                return new int[] {low+1,high+1};
            }
            if(nums[low]+nums[high]<target){
                low=low+1;
            }
            else{
                high=high-1;
            }
        }
        return new int[] {-1,-1};
    }
}