#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}

//FIFO -> First In First Out

void Queue() {
    queue<int> q;
    q.push(1); //{1}
    q.push(2); //{2}
    q.emplace(4); //{1,2,4}

    q.back() += 5 

    cout << q.back(); //prints 9
    
    //q is {1,2,9}
    cout << q.front() //prints 1

    q.pop(); //{2, 9}

    cout << q.front(); //prints 2

    // size and swap are the same as that of stack
    //O(1)
    //all operations are happening in constant time
    //this indicates that everything is happening at the same time(all the functions)

}