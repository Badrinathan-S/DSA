class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int lengthNums = nums.length;

        if(lengthNums == 0){
            return 0;
        }

        int longestLength = 1;
        int count = 1;

        for(int i=1;i<lengthNums;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                count++;
            }else {
                longestLength = Math.max(longestLength, count);
                count = 1;
            }
        }

        longestLength = Math.max(longestLength, count);
        return longestLength;
        
    }
}