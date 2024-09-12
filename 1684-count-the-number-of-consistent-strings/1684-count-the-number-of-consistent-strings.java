class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] s = new boolean[26];
        for (char c : allowed.toCharArray()) {
            s[c - 'a'] = true;
        }
        int ans = 0;
        for (String w : words) {
            if (check(w, s)) {
                ++ans;
            }
        }
        return ans;
        
        // Set<Character> se = new HashSet<>();
        // for(char ch:allowed.toCharArray()){
        //     se.add(ch);
        // }
        // int count = 0;
        // for(String word:words){
        //     boolean isAllowed = true;
        //     for(char ch:word.toCharArray()){
        //         if(!se.contains(ch)){
        //             isAllowed = false;
        //             break;
        //         }
        //     }
        //     if(isAllowed){
        //         count++;
        //     }
        // }
        // return count;
    }
    private boolean check(String w, boolean[] s) {
        for (int i = 0; i < w.length(); ++i) {
            if (!s[w.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}