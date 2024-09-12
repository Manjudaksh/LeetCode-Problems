class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ch = new boolean[26];
        for(char c: allowed.toCharArray()){
            ch[c-'a'] = true;
        }
        int count = 0;
        for(String word:words){
            boolean isAllowed = true;
            for(char w: word.toCharArray()){
                if(!ch[w-'a']){
                    isAllowed = false;
                    break;
                }
            }
            if(isAllowed){
                count++;
            }
        }
        return count;
        
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
}