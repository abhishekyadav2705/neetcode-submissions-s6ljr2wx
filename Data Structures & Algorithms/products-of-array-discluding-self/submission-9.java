class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int pre=1, post=1;

        for(int i=0;i<nums.length;i++){
            result[i]=pre;
            pre*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            result[j]*=post;
            post*=nums[j];
        }
        return result;
    }
}  
