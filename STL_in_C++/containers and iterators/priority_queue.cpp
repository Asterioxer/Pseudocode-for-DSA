#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}

void priority_queue() {
    //the largest element stays at the top (for string the lexicographically largest string stays at the top)
    priority_queue<int>pq;
    
    //maximum priority queue
    pq.push(5); //{5}
    pq.push(2); //{5,2}
    pq.push(8); //{8,5,2}
    pq.emplace(10); //{10,8,5,2}

    cout << pq.top(); // prints 10, sort directly to the top of the queue, in order of the maximum value element

    pq.pop(); //{8,5,2}

    cout << pq.top(); // prints 8

    //size, swap and empty functions are the same as others

    //Minimum Heap
    //Minimum priority queue
    priority_queue<int, vector<int>, greater<int>> pq;  
    pq.push(5); //{5}
    pq.push(2); //{2, 5}
    pq.push(8); //{2, 5, 8}
    pq.emplace(10); //{2, 5, 8, 10}    //a linear order is not maintained rather a tree data structure is maintained inside it(the priority queue)

    cout << pq.top() // prints 2

    //push -> log n(time complexity)
    //top -> O(1)
    //pop -> log n
    
}