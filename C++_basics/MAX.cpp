#include<bits/stdc++.h>
using namespace std;
int maxx(int n1, int n2) {
    if (n1>n2) return n1;
    else return n2;
}
int main() {
    int n1, n2;
    cin >> n1 >> n2;
    int maximum = maxx(n1, n2);
    cout << maximum;
    return 0;
}