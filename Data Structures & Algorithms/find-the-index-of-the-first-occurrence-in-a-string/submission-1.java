class Solution {
    public int strStr(String haystack, String needle) {
        int hLength=haystack.length();//8
        int nLength=needle.length();//5
        for(int i=0;i<=hLength-nLength;i++){
            String subs = haystack.substring(i,i+nLength);//0, 5
            if(subs.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}