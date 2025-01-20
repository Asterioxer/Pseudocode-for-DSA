void reverse(int arr[], int start, int end) {
    while(start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
//due to the presence of stl this isn't necessary in the c++ programming language.