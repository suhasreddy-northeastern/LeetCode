class Solution {
    public int findNumbers(int[] nums) {
        int even = 0 ;
        for(int i=0;i<nums.length;i++){
            String sample = Integer.toString(nums[i]);
            if(sample.length() % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
