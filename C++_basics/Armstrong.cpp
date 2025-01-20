#include<iostream>
#include<cmath>
using namespace std;

int main() {
    int n;
    cin >> n;
    int sum = 0;
    int ori = n;
    while (n > 0) {
        int rem = n % 10;
        sum += round(pow(rem, 3)); 
        n = n / 10;
    }
    if (sum == ori) 
        cout << "Armstrong Number";
    else 
        cout << "Not Armstrong Number";
    return 0;
}