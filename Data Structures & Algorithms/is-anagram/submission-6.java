class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder(t);
        for(char ch : s.toCharArray()){
           int index = sb.indexOf(String.valueOf(ch));
           if(index==-1){
            return false;
           }
           sb.deleteCharAt(index);
        }
        return true;
    }
}
