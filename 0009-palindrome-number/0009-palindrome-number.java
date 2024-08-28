class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int n = 0;
        int rem = 0;
        while(x > 0){
            rem = x % 10;
            n = n*10 + rem;
            x = x/10;
        }
        if(n == temp){
                return true;
            }
        return false;
    }
}