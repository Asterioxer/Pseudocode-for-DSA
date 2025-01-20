#include<bits/stdc++.h>
using namespace std;
// WAP that takes an input of age and prints if you are 
// an adult or not
int main() {
    int age;
    cin >> age;
    if (age >= 18) {
        cout << "You are an Adult!";
    }
    else if(age < 18) {
        cout << "You are not an adult!";
    }
    return 0;
}