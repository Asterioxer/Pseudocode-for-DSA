#include <bits/stdc++.h>
using namespace std;
void insertion_sort(int arr[], int n) {
    for(int i = 0; i <= n-1; i++) {
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
//T.C.->Worst and Average case scenario O(n^2)
//T.C.->Best case scenario only run for a single check 
//so the time complexity results in a O(N); linear time complexity
//does not run for any loops but only the 
//check(for loop runs which itself is running for n times only)
    }
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i=0; i<n; i++) cin >> arr[i];
    insertion_sort(arr, n);
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}