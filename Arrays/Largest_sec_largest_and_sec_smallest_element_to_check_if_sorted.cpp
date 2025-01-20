//largest element in an array
int largestelement(vector<int> &arr, int n) {
    int largest = arr[0];
    for(int i = 0; i<n; i++) {
        if(arr[i] > largest) {
            largest = arr[i];
        }
    }
    return largest;
}
 
//second largest element in an array
int seclar(vector<int> &a, int n) {
    int largest = a[o];
    int slar = -1;
    for(int i = 1; i < n; i++) {
        if (a[i] > largest) {
            slar = largest;
            largest = a[i];
        }
        else if(a[i] < largest && a[i] > slar) {
            slar = a[i];
        } 
    }
    return slar;
}

//TC->O(N)

//second smallest element 
int secsml(vector<int> &a, int n) {
    int smallest = a[0];
    int ssma = INT_MAX;
    for(int i = 1; i < n; i++) {
        if (a[i] < smalest) {
            ssma = smallest;
            smallest = a[i];
        }
        else if(a[i] != smallest && a[i] > slar) {
            ssma = a[i];
        } 
    }
    return ssma;
}
//TC->O(n)

vector<int> getSecondOrderElements(int n, vector<int> a) {
    int slar = seclar(a, n);
    int ssma = secsml(a, n);
    return {slar, ssma};
}

//To check if an array is sorted
int isSorted(int n, vector<int> a) {
    for(int i = 1; i < n; i++) {
        if(a[i] >= a[i-1]) {

    }
        else {
            return false;
        }
    }
    return true;
}

//TC-> O(N)