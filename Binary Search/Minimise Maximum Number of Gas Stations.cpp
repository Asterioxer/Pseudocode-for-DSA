#include <bits/stdc++.h>
using namespace std;

long double minimiseMaxDistance(vector<int> &arr, int k) {
    int n = arr.size(); //size of array.
    vector<int> howMany(n - 1, 0);
    priority_queue<pair<long double, int>> pq;

    //insert the first n-1 elements into pq
    //with respective distance values:
    for (int i = 0; i < n - 1; i++) {
        pq.push({arr[i + 1] - arr[i], i});
    }

    //Pick and place k gas stations:
    for (int gasStations = 1; gasStations <= k; gasStations++) {
        //Find the maximum section
        //and insert the gas station:
        auto tp = pq.top();
        pq.pop();
        int secInd = tp.second;

        //insert the current gas station:
        howMany[secInd]++;

        long double inidiff = arr[secInd + 1] - arr[secInd];
        long double newSecLen = inidiff / (long double)(howMany[secInd] + 1);
        pq.push({newSecLen, secInd});
    }

    return pq.top().first;
}

//The above is a priority queue based heap approach



#include <bits/stdc++.h>
using namespace std;

int numberOfGasStationsRequired(long double dist, vector<int>&arr) {
    int cnt = 0;
    for (int i = 1; i < arr.size(); i++) {
        int numinBetween= ((arr[i] - arr[i - 1]) / dist);
        if ((arr[i] - arr[i - 1]) / dist == numinBetween * dist) {
            numinBetween--;
        } 
        cnt += numinBetween;
    }
    return cnt;
}

long double minimiseMaxDistance(vector<int> &arr, int k) {
    int n = arr.size();
    long double low = 0;
    long double high = 0;
    for (int i = 0; i < n - 1; i++) {
        high = max(high, (long double)(arr[i + 1] - arr[i]));
    }

    long double diff = 1e-6;

    while (high - low > diff) {
        long double mid = ((low + high) / 2.0);
        int cnt = numberOfGasStationsRequired(mid, arr);
        if(cnt > k) {
            low = mid;
        } else {
            high = mid;
        }
    } 
    return high;
}

//above is the most optimal binary search approach