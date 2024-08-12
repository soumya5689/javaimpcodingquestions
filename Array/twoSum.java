package Array;

    public class twoSum {
        public static int[] twoSum(int[] nums, int target) {
            int[] nearestValue = new int[]{-1, -1};
            int nearestSum =Integer.MAX_VALUE;

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int sum = nums[i] + nums[j];
                    int difference = Math.abs(target - sum);

                    if (sum == target) {
                        return new int[]{i, j};
                    }

                    if (difference < nearestSum) {
                        nearestSum =difference;
                        nearestValue[0] = i;
                        nearestValue[1] = j;
                    }
                }
            }
            return nearestValue;
        }

        public static void main(String[] args) {
            int[] nums = {3, 6, 2, 8};
            int target = 3;
            int[] result = twoSum(nums, target);
            System.out.println(nums[result[0]] + " " + nums[result[1]]);
        }
    }
