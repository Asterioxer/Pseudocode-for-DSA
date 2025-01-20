#include<bits/stdc++.h>
using namespace std;

int main() {
    int a[5];//whatever data type has been defined must be 
             //constant for all the elements present in the array
    cin >> a[0] >> a[1] >> a[2] >> a[3] >> a[4];

    a[2] += 7; //This shows that array elements are maniputable
    a[1] = 21;
    cout << a[2] << a[1];
    return 0;
}
//the entire array is stored in a memory location
//randomised address it is stored at
//0th index is randomised but 1st, 2nd and so on gets
//stored right after the 0th one which is a random one(consecutive)
