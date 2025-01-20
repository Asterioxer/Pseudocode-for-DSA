#include<bits/stdc++.h>
using namespace std;
int main() {

    return 0;
}

void set() {
    //Set -> stores everything in the {sorted} order and unique {elements} 
    // unique element here suggests that the elements must not be repeated or duplicated
    set<int>st;
    st.insert(1); //{1}
    st.emplace(2); //{1,2}
    st.insert(2); //{1,2} //this shows the unique property of set  //this is also not a linear container, a tree is maintained
    st.insert(4);//{1,2,4}
    st.insert(3);//{1,2,3,4}

    //Functionality of insert in vector
    //can also be used, that only increases efficiency

    //begin, end, rbegin, rend, size
    //empty and swap are same as that of the other containers

    //{1,2,3,4,5}
    auto it = st.find(3);

    //{1,2,3,4,5}
    auto it = st.find(6); //iterator here points to the value(rather address) after 5 i.e.,after the last element of the set

    //{1,4,5}
    st.erase(5); //erases 5 and //this takes logarithmic time

    int cnt = st.count(1); //if 1(element) is present in the set, it would give i.e., the occurence 1 time

    auto it = st.find(3);
    st.erase(it); //either you take the value directly or the iterator after finding the required element with it

    //{1,2,3,4,5}
    auto it1 = st.find(2);
    auto it2 = st.find(4);
    st.erase(it1, it2); // after erase {1,4,5} [first, last]

    // lower_bound() and upper_bound() functions work in the same way
    //watch the video on upper bound and lower bound

    auto it = st.lower_bound(2);

    auto it = st.upper_bound(2);

    //in set everything works on logarithmic n time complexity[log N]

}