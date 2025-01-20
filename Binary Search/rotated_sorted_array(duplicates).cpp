bool searchInARotatedSortedArrayII(vector<int>&A, int key) {

    int low = 0;

    int high = A.size() -1;

    while(low <= high){

        int mid = (low + high)/2;

        if(A[mid] == key) return true;

        if(A[low] == A[mid] && A[high] == A[mid]){

            low ++;

            high--;

            continue;

        }

        if(A[low] <= A[mid]){

            if(A[low] <= key && key <= A[mid]){

                high = mid - 1;

            }

            else{

                low = mid + 1;

            }

        }

        else{

            if(key >= A[mid] && key <= A[high]){

                low = mid + 1;

            }

            else{

                high = mid -1;

            }

        }

    }

    return false;

}