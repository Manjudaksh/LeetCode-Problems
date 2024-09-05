class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int actualsum = 0;
        for(int i=0; i<rolls.length; i++){
            actualsum += rolls[i];
        }
        int rem = (mean*(rolls.length + n)) - actualsum;
        if(rem > 6*n || rem < n){
            return new int[]{};
        }
        int average = rem/n;
        int remain = rem%n;
        int[] result = new int[n];
        for(int i=0; i<remain; i++){
            result[i] = average + 1;
        }
        for(int i=remain; i<n; i++){
            result[i] = average;
        }
        return result;
    }
}