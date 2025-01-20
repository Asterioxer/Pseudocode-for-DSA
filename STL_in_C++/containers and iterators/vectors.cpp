#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}
// vectors store elements in a similar fashion as arrays do.
void eprvector() {  //vectors are dynamic in nature. modifiable as against arrays which are immutable
    vector<int> v; //any data type,eg. raj,90.54,64,etc
    
    v.push_back{1}; //takes 1 into itself i.e., the vector {1}
    v.emplace_back{2}; //takes 2 within the vector i.e., {1,2}. emplace_back is faster than pushback.

    vector<pair<int, int>vec;

    v.push_back{1,2}; //curly braces are a must for pushback
    v.emplace_back(1,2); //though without curly braces emplace back assumes the entered values as a pair
    
    vector<int> v(5, 100); //5 instances of a vector each element of value 100

    vector<int> v(5); //5 instances of any garbage value

    vector<int> v1(5, 20); //5 instances of 20
    vector<int> v2(v1); //a copy of vector v1
    //elments can be accessed by the indexing way as done in arrays
    
    //iterators
    vector<int>::iterator it = v.begin(); //it is just an initialized name
                                          //v.begin() gives the memory address
    it++;
    cout << *(it) << " "; //star is used to access the element in the memory address

    it += 2;
    cout << *(it) << " "; //2 elements forward in the vector

    vector<int>::iterator it = v.end(); //memory address right after the last element of the vector
                                        //if an it-- is done then the memory address of the last element is accessed

    vector<int>::iterator it = v.rend(); //*(points at this position(memory location before 1)){1,2,45,32}

    vector<int>::iterator it = v.rbegin();//{1,2,45,32}*points at the memory location of 32
    // it++ will move at 45. moves in a reverse path


    cout << v[0] << " " << v.at(0); //for the position of the vector

    cout << v.back() << " "; //element at the last position
    
    for (vector<int>::iterator it = v.begin(); it != v.end(); it++) { //helps to print the all the elements of the vector
        cout << *(it) << " ";
    }

    for(auto it = v.begin(); it != v.end(); it++) {  //a short way to without the need of defining the vector in the loop
        cout << it << " ";                           //auto means auto assigning value to something
    }

    for(auto it : v) {  //auto here is automatically iterating the elements of the vector(it) and prints the vector entirely
        cout << it << " ";  //without even having an update statement and or even a limit
    }
    // {10,20,12,23}
    v.erase(v.begin()+1); //this refers to the second element among the other elments of the vector and the vector would be reshuffled without including the seond element and would be sequenced accordingly    
    // {10,12,23}


    //{23,34,21,25,32}
    v.erase(v.begin()+2 , v.begin()+4);
    //{23,34,32} //{start,end}

    // Insert function

    vector<int>v(2, 100); //{100,100}
    v.insert(v.begin(), 300); //{300,100,100}
    v.insert(v.begin() + 1, 2, 10); //{300,10,10,100,100}

    vector<int> copy(2, 50); //{50,50}
    v.insert(v.begin(), copy.begin(), copy.end()); //{50,50,300,10,10,100,100}
    
    //{10,14}
    cout << v.size(); // 2 size of the vector
    
    //{10,50}
    v.pop_back(); //{10} pops out the last element
    
    //v1 = {10,20}
    //v2 = {30,40}
    v1.swap(v2); // v1 = {30,40} , v2 = {10,20}

    v1.clear(); //clears the entire vector

    cout << v.empty(); //returns true or false according to the requirement of the syntax (if the vector is empty returns true or else false)

}

