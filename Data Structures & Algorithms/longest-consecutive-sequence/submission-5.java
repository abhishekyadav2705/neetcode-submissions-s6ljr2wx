class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res=0;
        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            int streak=0, currentNum=num;
            while(set.contains(currentNum)){
                streak++;
                currentNum++;
            }
            res=Math.max(streak,res);
        }
        return res;
    }
}
