#include<bits/stdc++.h>
using namespace std;
void pattern7(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n-i-1;j++) {
            cout << " ";
        }
        for(int j=0;j<2*i+1;j++) {
            cout << "*";
        }
        for(int j=0;j<n-i-1;j++) {
            cout << " ";
        }
        
        cout << endl;
    }
    for(int i=n-1;i>=0;i--) {
        for(int j=n-i-2;j>=0;j--) {
            cout << " ";
        }
        for(int j=2*i;j>=0;j--) {
            cout << "*";
        }
        for(int j=n-i-1;j>=0;j--) {
            cout << " ";
        }
        
        cout << endl;
    }
}
int main() {
    int t;
    cin >> t;
    for (int i=0;i<t;i++) {
      int n;
      cin >> n;
      pattern7(n);
    }
}