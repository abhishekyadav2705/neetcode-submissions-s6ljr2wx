class Solution {
    public boolean checkInclusion(String s1, String s2) {
      char[] s1Array = s1.toCharArray();
      int n = s1.length();
      Arrays.sort(s1Array);
      for(int i=0;i<=s2.length()-n;i++){
        char[] subArray = s2.substring(i,i+n).toCharArray();
        Arrays.sort(subArray);

        if(Arrays.equals(s1Array,subArray)){
            return true;
        }
      }
      return false;
    }
}
