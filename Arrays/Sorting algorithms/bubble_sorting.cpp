#include <bits/stdc++.h>
using namespace std;
void bubble_sort(int arr[], int n) {
    for(int i=n-1; i>=0; i--) {
        for(int j=0; j<=i-1; j++) {
            if(arr[j] > arr[j+1]) {
                int te=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=te;
            }
        }
//T.C.-> O(n^2)  sum of n natural numbers.
//This goes for the average and best case scenarios
    }
}
void optimised_bubble_sort(int arr[], int n) {
    for(int i=n-1; i>=0; i--) {
        int DidSwap = 0;
        for(int j=0; j<=i-1; j++) {
            if(arr[j] > arr[j+1]) {
                int te=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=te;
                DidSwap = 1;
            }
        }
        if (DidSwap == 0) {
            break;
        }
        cout << "runs\n";
//for this being the best case scenario 
//it could have a Linear Time Complexity of O(n) itself
    }
}
int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i=0; i<n; i++) cin >> arr[i];
    optimised_bubble_sort(arr, n);
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}


