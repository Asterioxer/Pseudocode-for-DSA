//brute approach TC -> O(n^3)
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        int prod = 1;
        for (int k = i; k <= j; k++) {
            prod *= arr[k];
        }
        maxSum = max(maxSum, prod);
    }
}