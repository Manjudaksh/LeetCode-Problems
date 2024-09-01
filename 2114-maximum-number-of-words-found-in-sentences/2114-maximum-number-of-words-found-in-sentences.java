class Solution {
    public int mostWordsFound(String[] sentences) {
        int length = 0;
        for(String sentence : sentences){
            String[] s = sentence.split(" ");
            length = Math.max(s.length, length);
        }
        return length;
    }
}