class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subStr = s.substring(i,j+1);
                if(allUnique(subStr)){
                    maxLength=Math.max(maxLength, subStr.length());
                }
            }
        }
        return maxLength;
    }
    private boolean allUnique(String str){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!set.add(ch)){
                return false;
            }
        }
        return true;
    }
}
