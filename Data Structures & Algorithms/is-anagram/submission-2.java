class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb = new StringBuilder(t);

        for(char c : s.toCharArray()){
            int index = sb.indexOf(String.valueOf(c));

            if(index==-1){
                return false;
            }
            sb.deleteCharAt(index);
        }
        return sb.length()==0;
    }
}
