class Main {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(solution(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution(new int[]{7, 6, 4, 3, 1}));
        System.out.println(solution(new int[]{3, 2, 6, 5, 0, 3}));
        long e1 = System.currentTimeMillis();
        System.out.println("============");
        long s2 = System.currentTimeMillis();
        System.out.println(solution2(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution2(new int[]{7, 6, 4, 3, 1}));
        System.out.println(solution2(new int[]{3, 2, 6, 5, 0, 3}));
        long e2 = System.currentTimeMillis();

        System.out.println("1 = " + (e1 - s1)); // 8ms
        System.out.println("2 = " + (e2 - s2)); // 9ms

    }

    static int solution(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int minIdx = 0;
        int max = prices[0];
        int maxIdx = 0;
        int result = 0;

        for (int i = 1; i < len; i++) {
            if (min > prices[i]) {
                min = prices[i];
                minIdx = i;
            }

            if (prices[i - 1] < prices[i] && i > minIdx) {
                max = prices[i];
                maxIdx = i;
            }

            if (minIdx < maxIdx && result < (max - min)) {
                result = max - min;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        return result;
    }

    static int solution2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}