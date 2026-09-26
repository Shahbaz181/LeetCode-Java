class Solution {
    public int[] sortedSquares(int[] nums) {

       int n = nums.length;
       int[] result = new int[n];

       int left = 0, right = n-1;

       for(int i = n-1; i >= 0; i--){

        int leftsqr = nums[left] * nums[left];
        int rightsqr = nums[right] * nums[right];

        if(leftsqr > rightsqr){
            result[i] = leftsqr;
            left++;
        } else{
            result[i] = rightsqr;
            right--;
            }
        }

        return result;
    }
}