class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] result = new String[str.length];
        for(String word:str){
            result[word.charAt(word.length()-1) - '1'] = word.substring(0,word.length()-1);
        }
        return String.join(" ", result);
    }
}