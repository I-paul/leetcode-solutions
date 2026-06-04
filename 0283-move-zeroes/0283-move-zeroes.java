class Solution {
    public void moveZeroes(int[] nums) {
        int right =0;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==0)right++;
            else if (right>0){
                int t = nums[i];
                nums[i] =0;
                nums[i-right]=t;
            }
        }
    }
}