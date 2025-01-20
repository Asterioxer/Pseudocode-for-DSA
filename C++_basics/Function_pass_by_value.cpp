#include<bits/stdc++.h>
using namespace std;
void DoSomething(int num) {
    cout << num << endl;
    num += 5;
    cout << num << endl;
    num += 5;
    cout << num << endl;
}

int main() {
    int num = 10;
    DoSomething(num);
    cout << num << endl; //pass by value 
    return 0; //does not make changes to the original value
}


