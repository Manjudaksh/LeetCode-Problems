class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length];
        xor[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            xor[i] = xor[i-1]^arr[i];
        }
        int[] output = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int j=queries[i][0];
            int k=queries[i][1];
            if(j==0){
                output[i] = xor[k];
            }else{
                output[i] = xor[k]^xor[j-1];
            }
        }
        return output;
    }
}