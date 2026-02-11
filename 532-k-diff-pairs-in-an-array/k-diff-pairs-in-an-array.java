class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;

        int count = 0;

        int[] preSum = new int[n];

        int left = 0; int right = 1;

       while(left < n && right < n){
            if(left == right){
                right++;
                continue;
            }
            int diff = nums[right] - nums[left] ;
            if(diff == k){
                count++;

                int leftVal = nums[left];
                int rightVal = nums[right];
                while(left < n && nums[left] == leftVal) left++;
                while(right < n && nums[right] == rightVal) right++;
            }else if(diff < k){
                right++;
            }else {
                left++;
            }
        }
        return count;
    }
}