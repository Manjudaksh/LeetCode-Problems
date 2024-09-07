class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 0;
        for(int j=0; j<nums.length; j++){
            if(j < nums.length-1 &&  nums[j] == nums[j+1]){
                continue;
            } else{
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}