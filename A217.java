import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer len = nums.length;
        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > 1) {
                return true;
            }
        }
        return false;
    }

}