class Solution {
    public int reverse(int x) {
        int n = x>0?x:-x;
        long ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n = n/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)(x>0?ans:-ans);
    }
}