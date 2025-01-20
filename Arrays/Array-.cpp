#include<bits/stdc++.h>
using namespace std;

//pass by reference array always goes with reference
void doSo(int a[], int n) {
    a[0] += 100;
    cout << "Value of function: " << a[0] << endl;
}
int main() {
    int n=5;
    int a[n];
    for(int i = 0; i<n; i=i+1) {
        cin >> a[i];
    }

    doSo(a, n);

    cout << "Value inside int main: " << a[0] << endl;
    return 0;
}
//an array must contain similar kinds of data elements.
//as char string or pairs<int, int>
//arr[] -> [6] n=6
//when globally declared, all elements would by def take 0 value
//int arr[10^6] -> max limit(when declared under main())
//int arr[10^7] -> max limit(when declared globally)
//the first element of an array is always stored at a random memory location but the elements after it are the immediate(contiguous) next addresses of that random address
