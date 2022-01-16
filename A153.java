class Main {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
    }

    public static int findMin(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        int min = Integer.MAX_VALUE;
        int mid = 0;
        while (l < r){
            if (nums[l] < nums[r])
                return nums[l];

            mid = (l + r) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return nums[l];
    }
}