class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;

        int[] answers = new int[nums.length];

        //left -> right 
        for(int i=0; i<nums.length; i++){
            answers[i] = prefix;
            prefix *= nums[i];
        }
        //right -> left
        for(int i=nums.length-1; i>=0; i--){
            answers[i] *= suffix;
            suffix *= nums[i];
        }
        
        return answers;
    }
}