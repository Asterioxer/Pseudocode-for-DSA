//brute and better approaches, hash map
#include <bits/stdc++.h>
int longestSubarrayWithSumK(vector<int> a, long long k) {
    map<long long, int> preSumMap;
    long long sum = 0;
    int maxLen = 0;
    for (int i = 0; i<a.size(); i++) {
        sum += a[i];
        if(sum == k) {
            maxLen = max(maxLen, i+1);
        }
        long long rem=sum-k;
        if(preSumMap.find(rem) != preSumMap.end()) {
            int len=i-preSumMap[rem];
            maxLen=max(maxLen, len);
        }
        if(preSumMap.find(sum) == preSumMap.end()) {
            preSumMap[sum] = i;
        }
    }
    return maxLen;
}
//works for positives and negatives
//brute O(n^2) better (Un_map-O(n*1)) O(n log n)


// for positives 2 pointer most optimal approach
int longestSubarrayWithSumK(vector<int> a, long long k) {
    int n = a.size(); // size of the array.

    int left = 0, right = 0; // 2 pointers
    long long sum = a[0];
    int maxLen = 0;
    while (right < n) {
        // if sum > k, reduce the subarray from left
        // until sum becomes less or equal to k:
        while (left <= right && sum > k) {
            sum -= a[left];
            left++;
        }

        // if sum = k, update the maxLen i.e. answer:
        if (sum == k) {
            maxLen = max(maxLen, right - left + 1);k
        }

        // Move forward thw right pointer:
        right++;
        if (right < n) sum += a[right];
    }

    return maxLen;
}