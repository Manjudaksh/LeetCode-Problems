class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            pq.add(num);
        }
        while(k > 0){
            int largest = pq.poll();
            score += largest;
            int newVal = (int)Math.ceil(largest/3.0);
            pq.add(newVal);
            k--;
        }
        return score;
    }
}