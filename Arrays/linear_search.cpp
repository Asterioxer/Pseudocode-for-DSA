#include <iostream> 
using namespace std; 
int main() 
{ 
   // Declare the array with the size and the array elements 
  int array[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
 
   // Declare the element to be searched 
  int item; 
   cout << "Enter the item to be searched: "; 
   cin >> item; 
   // Iterate through the array and compare each element of the array to the item 
   for (int i = 0; i < 10; i++) { 
      if (array[i] == item) { 
           cout << "Gotcha";
           break; 
       } 
      else {
        cout << "Item not found";
        break;
      }
   } 
}