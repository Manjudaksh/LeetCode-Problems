class Solution {
    public boolean canJump(int[] nums) {
        int i = nums.length-1;
        for(int j=nums.length-2; j>=0; j--){
            if(i <= nums[j]+j){
                i = j;
            }
        }
        return i==0;
    }
}