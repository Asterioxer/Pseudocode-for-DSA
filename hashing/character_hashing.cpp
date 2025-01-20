#include<bits/stdc++.h>
using namespace std;
int main() {
    string s;
    cin >> s;

    // pre-compute
    int chash[26] = {0};
    for(int i=0;i<s.size();i++) {
        chash[s[i] - 'a']++; 
    }
    int q;
    cin >> q;
    while(q--) {
        char ch;
        cin >> ch;
        // fetch
        cout << chash[ch - 'a'] << endl;
    }
    return 0;
}