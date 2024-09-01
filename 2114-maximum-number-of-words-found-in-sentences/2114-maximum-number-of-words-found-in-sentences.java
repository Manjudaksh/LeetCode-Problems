class Solution {
    public int mostWordsFound(String[] sentences) {
        int length = 0;
        for(String sentence : sentences){
            String[] s = sentence.split(" ");
            if(s.length > length){
                length = s.length;
            }
        }
        return length;
    }
}