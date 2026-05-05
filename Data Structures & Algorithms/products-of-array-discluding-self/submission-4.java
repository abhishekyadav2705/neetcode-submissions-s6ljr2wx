class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,post=1;
        int[] answer= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]=pre;
            pre *=nums[i];
        }

        for(int j=nums.length-1; j>=0; j--){
            answer[j]=post*answer[j];
            post*=nums[j];
        }

        return answer;
    }
}  
