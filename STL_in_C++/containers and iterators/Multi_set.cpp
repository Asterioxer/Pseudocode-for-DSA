#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}

void multi_set() {
    //muti set only obeys sorted not the uniqueness of data 

    multiset<int>ms;
    ms.insert(1); //{1}
    ms.insert(1); //{1,1}
    ms.insert(1); //{1,1,1} //this can be understood via the code beside
    
    ms.erase(1); //erases all occurences of the number 1
    
    int cnt = ms.count(1); //counts the number of 1's in the multiset
    
    ms.erase(ms.find(1)); //here erases only one occurence
    //this is how we are only suggesting to erase that specific address not all of the occurences as 
    //if we give it one value it erases all the occurences but if we provide only a single address of that value then only that specific occurence would be erased
    ms.erase(ms.find(1), ms.find(1)+2);

    //rest all the functions are same that of sets


}