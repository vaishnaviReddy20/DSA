class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maximumStorage = Integer.MIN_VALUE;
        while(left<right){
            int SmallWall = Math.min(height[left],height[right]);
            int Storage = SmallWall * (right - left);
            maximumStorage = Math.max(Storage, maximumStorage);
        if(height[left]<height[right]){
            left++;
        }
         else{
            right--;
         }
        }

        return maximumStorage;
        

        
    }
}