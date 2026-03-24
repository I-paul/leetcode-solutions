class Solution {
    public int maxArea(int[] height) {
        int l= 0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int minh=Math.min(height[l],height[r]);
            int width = r-l;
            int vol = minh*width;
            res = Math.max(res,vol);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}