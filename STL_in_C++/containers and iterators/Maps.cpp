#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}

void Map() {
    //map is container which stores values as pairs of keys:values
    //values may be duplicated but the key should necessarily be unique
    //key may of any data type

    map<int, int>mpp;

    map<int, pair<int, int>>mpp;

    map< pair<int, int>, int> mpp;

    mpp[1] = 2; //firstly this gets entered as key:value pair
    mpp.emplace({3, 1}); //{3,1} stored as key:value

    mpp.insert({2,4}); //will get inserted directly

    mpp[{2,3}] = 10; //{2 keys : 1 value}

    {
        {1,2}
        {2,4}
        {3,1}
        //the results from the above
        //also the keys are stored in an ordered way too
    }

    for(auto it : mpp) {
        cout << it.first << " " << it.second << endl;
    }
    //stores in a pair each time
    //map stores keys on the principle of uniqueness and sortedness 
    [{1, 2} {2, 4} {3, 1}]  //sorted order of key

    cout << mpp[1]; //accesses the value present for key 1 i.e.,{value 2}
    cout << mpp[5]; //if a value does not exist the this returns null(0) value.
    
    auto it = mpp.find(3); //3 is the key which has been accessed
    cout << *(it).second; //here 1 (the value present in the key{3} is accessed)
    
    auto it = mpp.find(5); points to mpp.end() i.e.,after the map

    //This is the syntax
    auto it = mpp.lower_bound(2);

    auto it = mpp.upper_bound(3);

    //erase, swap, size, empty, are the same as that of the other containers
    //log N <- time complexity
}