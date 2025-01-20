#include<stdio.h>
int main()
{
   int size=0;
   int arr[size] = {1, 20, 5, 78, 30};
   int element, pos, i;
   printf("Enter position and element\n");
   scanf("%d%d",&pos,&element);
   if(pos <= size && pos >= 0)
   {
       //shift all the elements from the last index to pos by 1 position to the right
       for(i = size; i > pos; i--)
           arr[i] = arr[i-1];
       //Insert element at the given position
       arr[pos] = element;
   
       for(i = 0; i <= size-1; i++)
           printf("%d ", arr[i]);
   }
   else
       printf("Invalid Position\n");
   return 0;
 }