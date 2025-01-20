#include<bits/stdc++.h>
using namespace std;
int firstOccurence(vector<int> &arr, int n, int k) {
    int low = 0, high = n - 1, first = -1;
    while(low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            first = mid;
            high = mid - 1;
        } else if(arr[mid] < k) low = mid + 1;
        else high = mid - 1;
    }
    return first;
}

int lastOccurence(vector<int> &arr, int n, int k) {
    int low = 0, high = n - 1, last = -1;
    while(low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            last = mid;
            low = mid + 1;
        } else if(arr[mid] < k) low = mid + 1;
        else high = mid - 1;
    }
    return last;
}

pair<int, int> FirstAndLastPosition(vector<int> &arr, int n, int k) {
    int first = firstOccurence(arr, n, k);
    if(first == -1) return {-1, -1};
    int last = lastOccurence(arr, n, k);
    return {first, last};
}

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> arr(n);
    for(int i = 0; i < n; i++) cin >> arr[i];
    pair<int, int> ans = FirstAndLastPosition(arr, n, k);
    cout << ans.first << " " << ans.second;
    return 0;
}