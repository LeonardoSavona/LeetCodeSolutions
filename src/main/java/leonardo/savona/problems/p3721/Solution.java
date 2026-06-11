package leonardo.savona.problems.p3721;

import java.util.*;

class Solution {
    public static final String TITLE = "3721. Longest Balanced Subarray II";


    int[] lazy, minVal, maxVal;

    void build(int node, int start, int end) {

        lazy[node] = minVal[node] = maxVal[node] = 0;

        if (start < end) {

            int mid = (start + end) / 2;

            build(2 * node, start, mid);

            build(2 * node + 1, mid + 1, end);

        }

    }

    void pushDown(int node) {

        if (lazy[node] != 0) {

            for (int c : new int[]{2*node, 2*node+1}) {

                lazy[c] += lazy[node];

                minVal[c] += lazy[node];

                maxVal[c] += lazy[node];

            }

            lazy[node] = 0;

        }

    }

    void rangeAdd(int node, int start, int end, int l, int r, int val) {

        if (r < start || end < l) return;

        if (l <= start && end <= r) {

            lazy[node] += val; minVal[node] += val; maxVal[node] += val;

            return;

        }

        pushDown(node);

        int mid = (start + end) / 2;

        rangeAdd(2*node, start, mid, l, r, val);

        rangeAdd(2*node+1, mid+1, end, l, r, val);

        minVal[node] = Math.min(minVal[2*node], minVal[2*node+1]);

        maxVal[node] = Math.max(maxVal[2*node], maxVal[2*node+1]);

    }

    int findFirst(int node, int start, int end, int ql, int qr, int target) {

        if (qr < start || end < ql || minVal[node] > target || maxVal[node] < target) return -1;

        if (start == end) return start;

        pushDown(node);

        int mid = (start + end) / 2;

        if (ql <= mid) {

            int left = findFirst(2*node, start, mid, ql, Math.min(qr,mid), target);

            if (left != -1) return left;

        }

        return qr > mid ? findFirst(2*node+1, mid+1, end, Math.max(ql,mid+1), qr, target) : -1;

    }

    public int longestBalanced(int[] nums) {

        int n = nums.length;

        lazy = new int[4*(n+1)]; minVal = new int[4*(n+1)]; maxVal = new int[4*(n+1)];

        build(1, 0, n);

        int[] lastOcc = new int[100001];

        Arrays.fill(lastOcc, -1);

        int maxLen = 0;

        for (int r = 0; r < n; r++) {

            int prev = lastOcc[nums[r]];

            lastOcc[nums[r]] = r;

            rangeAdd(1, 0, n, prev + 1, r, (nums[r] & 1) == 0 ? 1 : -1);

            int minL = findFirst(1, 0, n, 0, r, 0);

            if (minL != -1) maxLen = Math.max(maxLen, r - minL + 1);

        }

        return maxLen;

    }

}
 