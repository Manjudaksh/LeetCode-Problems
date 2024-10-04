class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int end = skill.length-1;
        int start = 0;
        long ans = 0;
        while(start < end){
            long sum = skill[start]+skill[end];
            long totalskill = skill[start]*skill[end];
            start++;
            end--;
            long maxsum = skill[start]+skill[end];
            if(sum != maxsum){
                return -1;
            } else {
                sum = maxsum;
                ans += totalskill; 
            }
        }
        return ans;
    }
}