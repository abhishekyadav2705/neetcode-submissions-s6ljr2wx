class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);

        String s1Sorted = new String(s1Array);
        int n = s1.length();
        for(int i=0;i<=s2.length()-n;i++){
            char[] s2Array = s2.substring(i,i+n).toCharArray();
            Arrays.sort(s2Array);
            if(s1Sorted.equals(new String (s2Array))){
                return true;
            }
        }
        return false;
    }
}
