#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}
void list() {
    list<int> ls;

    ls.push_back(2); //{2}
    ls.emplace_back(4); //{2,4}

    ls.push_front(5); //{5,2,4}

    ls.emplace_front(); {2, 4};

    //rest of the functions are same as that of vectors
    // begin, end, rbegin, rend, clear, insert, size, swap
}