class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> res = new HashMap<>();
        for(int i=0 ; i<nums.length;i++){
            int temp = target-nums[i];
            if(res.containsKey(temp)){
                return new int []{res.get(temp),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{};
    }
}