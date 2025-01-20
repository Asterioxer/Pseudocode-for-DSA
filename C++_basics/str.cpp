#include<bits/stdc++.h>
using namespace std;

int main() {
    string s = "Striver";
    int len = s.size();
    cout << s[len - 1] << endl;
    s[len - 1] = 'z';
    cout << s << endl;
    cout << s[3];
    return 0;
}