class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        int tmp = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            tmp *= nums[i + 1];
            arr[i] *= tmp;
        }

        return arr;
    }
}