public class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        long mask1 = 0;
        long mask2 = 0;
        int n = A.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            mask1 |= 1L << A[i];
            mask2 |= 1L << B[i];
            long c = mask1 & mask2;
            res[i] = Long.bitCount(c);
        }
        return res;
    }
}
