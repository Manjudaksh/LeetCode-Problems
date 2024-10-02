class Solution {
    public int largestAltitude(int[] gain) {
        int point = 0;
        int highestalt = 0;
        for(int i=0; i<gain.length; i++){
            point = point+gain[i];
            if(point > highestalt){
                highestalt = point;
            }
        }
        return highestalt;
    }
}