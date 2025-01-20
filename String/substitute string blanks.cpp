#include <bits/stdc++.h> 

string replaceSpaces(string &str){

    // Write your code here.

    int n=str.length();

    string temp="";

    for(int i=0;i<n;i++)

    {

        if(str[i]==' ')

        {

            temp.append("@40");

        }

        else

        {

            temp.push_back(str[i]);

        }

    }

    return temp;

}