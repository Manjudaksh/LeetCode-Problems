class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int [nums.length];
        for(int i=1; i<leftsum.length; i++){
            leftsum[i] = leftsum[i-1] + nums[i-1];
        }
        int[] rightsum = new int [nums.length];
        for(int i=rightsum.length-2; i>=0; i--){
            rightsum[i] = rightsum[i+1] + nums[i+1];
        }
        int[] result = new int [nums.length]; 
        for(int i=0; i<result.length; i++){
            result[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return result;
    }
}