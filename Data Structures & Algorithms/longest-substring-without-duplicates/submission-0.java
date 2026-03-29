class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* 
        - maxLength=0
        - Loop i from 0->n
        - create a set to store character
        - for j from i->n

        if(s[j]) is alreay in the set ->break;
        otherwise add it to the set
        maxLength =max(maxLength,j-i+1)
        */


        int n = s.length();
        int maxLength =0;
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<n;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                maxLength= Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}
