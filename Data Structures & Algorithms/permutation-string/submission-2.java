class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String s1Sorted = new String(s1Array);

        for(int i=0;i<=s2.length()-s1.length();i++){
            char[] s2Array = s2.substring(i,i+s1.length()).toCharArray();
             Arrays.sort(s2Array);
             String s2Sorted = new String(s2Array);
            if(s1Sorted.equals(s2Sorted)){
                return true;
            }
        }
        return false;

    }
}
