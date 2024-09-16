class Solution {
    public int findMinDifference(List<String> timePoints) {
        String str = "";
        int n = timePoints.size();
        int[] arr = new int[n];
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            str =  timePoints.get(i);
            int hour = Integer.parseInt(str.substring(0,2));
            int minutes = Integer.parseInt(str.substring(3));
            arr[i] = (hour*60)+minutes;
        }
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            minimum = Math.min(minimum, arr[i+1]-arr[i]);
        }
        // int result = (24*60)-arr[n-1]+arr[0];
        // result = Math.min(result, minimum);
        
        return Math.min((24*60)-arr[n-1]+arr[0], minimum);
    }
}