class Solution {
    void  solve(int [] nums, int i , List<Integer> arr, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        solve(nums,i+1,arr,ans);
        arr.remove(arr.size()-1);
        solve(nums,i+1,arr,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        solve(nums,0 ,arr, res );
        return res;
    }
}