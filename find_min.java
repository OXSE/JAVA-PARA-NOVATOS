int find_min(int[] A) {
    int ans = 0;
    for (int i = 1; i < A.length; i++) {
        if (ans > A[i]) {
            ans = A[i];
        }
    }
    return ans;
}