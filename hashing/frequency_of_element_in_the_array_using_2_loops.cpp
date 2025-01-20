
    //pre compute
    // the pre computation is being done in the main function itself
    //shows how values are stored in the map before actual execution
         //auto iterator is used to show that we want represent the map as key:value pairs
       
#include <bits/stdc++.h>
using namespace std;
 
void countFreq(int arr[], int n)
{
    vector<bool> visited(n, false);
 
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        cout << arr[i] << " " << count << endl;
    }
}
 
int main()
{
    int arr[] = {10,5,10,15,10,5};
    int n = sizeof(arr) / sizeof(arr[0]);
    countFreq(arr, n);
    return 0;
}

//TC-> O(N*N)
//SC-> O(N)
//results into 2N but this 2 may be neglected and the final value produced would be N itself.
