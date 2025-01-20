#include<bits/stdc++.h>
using namespace std;
//Functions are set of code which perform something for you
//Functions are used to modularise code
//Funtions are used to increase readability
//Functions are used to use some code multiple times
//void _ does not return anything
//return
//parameterised
//non parameterised
void printName(string name) {
    cout << "Hey " << name << endl;
}
int main() {
    string name;
    cin >> name;
    printName(name);

    string name_2;
    cin >> name_2;
    printName(name_2);
    return 0;
}