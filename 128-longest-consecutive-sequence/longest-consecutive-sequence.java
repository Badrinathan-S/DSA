class Solution {
    public int longestConsecutive(int[] nums) {

         Set<Integer> set = new HashSet<>();

        // Insert all numbers into the set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Iterate over each number in the set
        for (int num : set) {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
        
    }
}