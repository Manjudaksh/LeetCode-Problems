class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] range = new int[2];
        range[0] = 0;
        range[1] = Integer.MAX_VALUE;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.size(); i++){
            max = Math.max(max, nums.get(i).get(0));
            pq.offer(new int[] {
                nums.get(i).get(0),
                0,
                i
            });
        }
        while(true){
            int[] minInfo = pq.poll();
            int min = minInfo[0];
            int row = minInfo[1];
            int col = minInfo[2];
            // int max = Integer.MIN_VALUE;
            
            // int micColIndex = 0;

            // for(int i=0; i<nums.size(); i++){
            //     if(nums.get(i).get(indices[i]) < min) {
            //         min = nums.get(i).get(indices[i]);
            //         minColIndex = i;
            //     }

            //     max = Math.max(max, nums.get(i).get(indices[i]));
            // }

            if((max - min) < (range[1] - range[0])){
                range[0] = min;
                range[1] = max;
            }

            // indices[miColIndex]++;

            if(row + 1 < nums.get(col).size()){
                pq.offer(new int[] {
                    nums.get(col).get(row+1),
                    row + 1,
                    col
                });
                max = Math.max(max, nums.get(col).get(row+1));
            }else{
                break;
            }

            // if(indices[minColIndex] == nums.get(minColIndex).size()){
            //     break;
            // }
        }
        return range;
    }
}