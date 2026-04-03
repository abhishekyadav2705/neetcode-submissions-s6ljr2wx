class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(char c : s1.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
       }

       for(int i=0;i<=s2.length()-s1.length();i++){
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] subArray = s2.substring(i,i+s1.length()).toCharArray();

        for(char c : subArray){
        map2.put(c,map2.getOrDefault(c,0)+1);
       }
       if(map.equals(map2)){
        return true;
       }
       }
       return false;
    }
}
