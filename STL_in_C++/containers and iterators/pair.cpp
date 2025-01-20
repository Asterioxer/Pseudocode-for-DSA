#include<bits/stdc++.h>
using namespace std;

//pairs
void eprpair() {

    pair<int, int> p = {1,3};

    cout << p.first << " " << p.second;

    pair<int, pair<int,int>> p = {1,{3,4}};

    cout << p.first << " " << p.second.second << p.second.first;

    pair<int, int> arr[] = {{1,2}, {2,5}, {5,1}};

    cout << arr[1].second;
}
int main() {
    int a = eprpair();
    cout << a;
    return 0;
}