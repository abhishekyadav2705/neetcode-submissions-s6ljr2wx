class Solution {
    public int missingNumber(int[] nums) {
       int answer=0;
       HashSet<Integer> set = new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       while(set.contains(answer)){
        answer++;
       }
       return answer;
    }
}
