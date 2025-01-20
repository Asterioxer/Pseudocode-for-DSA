#include<bits/stdc++.h>
using namespace std;

void doEvey(string &s) {
    s[0] = 'T';
    cout << s << endl;
}

int main() {
    string s = "Raj";
    doEvey(s); 
    cout << s << endl;
    return 0;
}

// & changes the address of that specific original value