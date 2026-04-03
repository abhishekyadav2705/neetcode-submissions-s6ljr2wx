class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int ans =0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(allUnique(s,i,j)){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private boolean allUnique(String s, int left, int right){
        boolean[] seen = new boolean[126];
        for(int i=left;i<=right;i++){
            char c = s.charAt(i);
            if(seen[c]){
                return false;
            }
            seen[c]=true;
        }
        return true;
    }
}
