class Solution {
    int BinarySearch(int []nums, int target, boolean flag){
        int l=0;
        int h= nums.length -1;
        int ans =-1;
        while(l<=h){
            int mid= (l+h)/2;
            if(nums[mid]==target){
                ans=mid;
                if(flag){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int F=BinarySearch(nums,target,true);
        int L=BinarySearch(nums,target,false);
        return new int[]{F,L};
    }
}