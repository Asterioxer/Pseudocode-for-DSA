#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> cnt(4, 0);
        for (int i = 0; i < n; i++) {
            int num;
            cin >> num;
            cnt[num % 4]++;
        }

        int cnt0 = cnt[0];
        int cnt1 = cnt[1];
        int cnt2 = cnt[2];
        int cnt3 = cnt[3];

        int cntmovs = 0;
        int minpair = min(cnt1, cnt3);

        cnt1 -= minpair;
        cnt3 -= minpair;
        cntmovs += minpair;
        
        if (cnt1 > 0 || cnt3 > 0) {
            if ((cnt1 + cnt3) % 2 == 1) {
                cout << "Alice" << endl;
            } else {
                cout << "Bob" << endl;
            }
        }
    }
  return 0;
}