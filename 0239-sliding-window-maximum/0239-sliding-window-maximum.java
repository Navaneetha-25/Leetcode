class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, n = nums.length, maxNum = Integer.MIN_VALUE;
        int[] res = new int[n - k + 1];
        int idx = 0;
        int front = - 1;
        while(i < n) {
            if(i - k + 1 > 0) {
                front = dq.peekFirst();
                if(front <= i - k)
                    dq.removeFirst();
            }
            while(dq.peekLast() != null && nums[dq.peekLast()] < nums[i])
                dq.removeLast();
            dq.addLast(i);
            i++;
            if(i - k + 1 > 0)
                res[idx++] = nums[dq.peekFirst()];
        }
        return res;
    }
}