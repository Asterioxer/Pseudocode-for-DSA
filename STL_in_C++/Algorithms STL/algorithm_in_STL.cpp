#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}


bool comp(pair<int, int> p1, pair<int, int> p2)** {
    if(p1.second < p2.second) return true;
    if(p1.second > p2.second) return false; //when the return is false the internally the comparator swaps the two variables
    //if they are same

    if(p1.first > p2.first) return true;
    return false; //if false swap
}
void Sort() {
    sort(a, a + n); //this directly sorts the items of the container without the need to use any sorting techniques like bubble sort or selection sort
    //{1,3,5,2} -> sorted as {1,2,3,5} a+n points to the position after 2 and a is the positional element 1
    sort(v.begin(), v.end()); //this represents a and a+n

    sort(a+2, a+4); //sorts from element 5 to 2

    sort(a, a+n, greater<int>); //greater<int> is a comparator; the elements automatically get arranged in the descending order

    pair<int, int> a[] = {{1, 2}, {2, 1}, {4, 1}}
    // own way: sort it according to the second element first
    // if the second element is the same, then sort it according to the first element but in descending

    sort(a, a+n, comp);**
    //whenever there is a need of my way then the above syntax maybe followed
    
    int num = 7;
    int cnt = __builtin_popcount(); //an important stl
    //this returns the value as binary set bits ;111 -> answer >3
    //32 bits in the computer; the last 3 are taken as that is what it gets converted to after doing the binary conversion operations
    long long num = 165734235487;
    int cnt = __builtin_popcountll(); //integer would'nt suffice
    
    string s = "123";
    sort(s.begin(), s.end()); //we need to sort it because if it isn't sorted then the permutations might differ from what we might actually need
    do {
        cout << s << endl;
    } while(next_permutation((s.begin), s.end())) //permutation is nothing but a way of dictionary order; this means all the possible values of the string s i.e.,123 132 213 231 312 321 starts from 123 
    
    int maxi = *max_element(a, a+n); //max_element alone gives the address and with the star i.e.,*max_element gives the element itself i.e., the value
    //similarly a min_element also does exist
}