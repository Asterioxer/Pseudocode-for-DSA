#include <bits/stdc++.h>
using namespace std;

void Frequency(int arr[], int n)
{
    unordered_map<int, int> map;

    for (int i = 0; i < n; i++)
        map[arr[i]]++;

    int maxF = 0, minF = n;
    int maxE = 0, minE = 0;
    // Traverse through map to find the elements.
    for (auto it : map) {
        int count = it.second;
        int element = it.first;

        if (count > maxF) {
            maxE = element;
            maxF = count;
        }
        if (count < minF) {
            minE = element;
            minF = count;
        }
    }

    cout << "The highest frequency element is: " << maxE << "\n";
    cout << "The lowest frequency element is: " << minE << "\n";
}

int main()
{
    int arr[] = {10, 5, 10, 15, 10, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    Frequency(arr, n);
    return 0;
}

//TC-> O(N) 
//SC-> O(N)