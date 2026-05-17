class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            boolean found=false;
            for(int num : nums){
                if(num==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                list.add(i);
            }
        }
        return list;
    }
}