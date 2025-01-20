#include<bits/stdc++.h>
using namespace std;
int floorVal(vector<int> &a, int n, int x) { //lower bound
	int ans = -1, low = 0, high = n-1;
	while(low <= high) {
		int mid = (high + low) / 2;
		if(a[mid] <= x) {
			ans = a[mid];
			low = mid + 1;
		} else {
			high = mid - 1;
		}
	}
	return ans;
}
int ceilval(vector<int> &a, int n, int x) {
	int low = 0, high = n - 1;
	int ans = -1;
	while(low <= high) {
		int mid = (low + high) / 2;
		if(a[mid] >= x) {
			ans = a[mid];
			high = mid - 1;
		} else {
			low = mid + 1;
		}
	}	
	return ans;
}
pair<int, int> getFloorAndCeil(vector<int> &a, int n, int x) {
	sort(a.begin(), a.end());
	int floor = floorVal(a, n, x);
	int ceil = ceilval(a, n, x);
	return make_pair(floor, ceil);
}

//Alternative, cuz the previous, above code seems to be partially accepted
pair<int, int> getFloorAndCeil(vector<int> &a, int n, int x) {
	    int low = 0, high = n - 1;
        int floor = -1, ceil = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == x) {
                return {x, x};
            }
            else if (a[mid] < x) {
                low = mid + 1;
                floor = mid;
            }
            else {
                high = mid - 1;
                ceil = mid;
            }
        }

		if (floor == -1) {
			return {-1, a[ceil]};
		}
		else if (ceil == -1) {
			return {a[floor], -1};
		}
        
        return { a[floor], a[ceil] };
}