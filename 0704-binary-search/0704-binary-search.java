class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while( start <= end){
            int mid = (start + end) / 2; 

            if(nums[mid] == target){  //target found
                return mid;
            }

            if(nums[mid] < target){
                start = mid + 1; //right
            } else {
                end = mid - 1;  //left
            }
        }
        return -1;
    }
}