class Solution {
    public String restoreString(String s, int[] indices) {
        // StringBuilder sb = new StringBuilder(s);
        // for(int i=0; i<indices.length; i++){
        //     sb.setCharAt(indices[i], s.charAt(i));
        // }
        // return new String(sb);
        char[] ch = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
}