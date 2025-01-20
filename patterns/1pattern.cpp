#include<bits/stdc++.h>
using namespace std;
void pattern1(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cout << "*";
        }
        cout << endl;
    }
}
int main() {
    int t; /*any program is run on multiple test case where the reason lies behind testing a piece of code is tested multiple test cases*/
    cin >> t;
    for(int i=0;i<t;i++) {
        int n;
        cin >> n;
        pattern1(n);
    }
    return 0;
}