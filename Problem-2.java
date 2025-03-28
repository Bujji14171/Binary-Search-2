class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == n - 1 || nums[mid] <               nums[mid + 1])) return nums[mid];
            else if(nums[mid] <= nums[high]){ // right sorted
                high = mid -1 ;
            }else{ // left sorted
                low = mid + 1;
            }
        }
        return -1;
    }
}