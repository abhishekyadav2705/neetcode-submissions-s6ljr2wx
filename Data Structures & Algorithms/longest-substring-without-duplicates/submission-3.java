class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subString = s.substring(i,j+1);
                if(allUnique(subString)){
                    maxLength=Math.max(maxLength,subString.length());
                }
            }
        }
        return maxLength;
    }
    private boolean allUnique(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(!set.add(c)){
                return false;
            }
        }
        return true;
    }
}
