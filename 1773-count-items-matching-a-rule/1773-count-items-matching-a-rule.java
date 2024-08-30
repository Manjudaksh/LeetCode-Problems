class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = -1;
        if(ruleKey.equals("type")){
            key = 0;
        } else if(ruleKey.equals("color")){
            key = 1;
        } else{
            key = 2;
        }
        int count = 0;
        for(List<String> list : items){
            if(list.get(key).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}