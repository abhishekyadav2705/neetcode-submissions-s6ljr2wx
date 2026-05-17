class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num>0){
                set.add(num);
            }
        }

        int answer=1;
        while(set.contains(answer)){
            answer++;
        }
        return answer;

    }
}