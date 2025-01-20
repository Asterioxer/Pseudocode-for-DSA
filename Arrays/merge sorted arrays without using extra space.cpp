//optimal solution using two pointers
void merge (long long ar1[], long long ar2[], int n, int m) {
    int left = n - 1;
    int right = 0;
    while (left >= 0 && right < m) {
        if (ar1[left] > ar2[right]) {
            swap(ar1[left], ar2[right])
            left--, right++;
        }
        else {
            break;
        }
    }
    sort(ar1, ar1 + n);
    sort(ar2, ar2 + m);
} // T.C. -> O(min(n, m)) + O(n log n) + O(m log m) //for sorting 
//(at the worst case when we are iterating over upto the 0th index)
//S.C. -> O(1) no extra space is being used except the ar1[] and ar2[]


//optimal approach: gap method from shell sorting
//each time the overall length is being divided and the position og pointers is being given accordingly
class Solution {
    private:
    void swapIfGreater(long long ar1[], long long ar2[], int ind1, int ind2) {
        if (ar1[ind1] > ar2[ind2]) {
            swap(ar1[ind1], ar2[ind2]);
        }
    }
    public:
    void merging(long long ar1[], long long ar2[], int n, int m) {
        int len = (n + m);
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while(right < len) {
                if (len < n && right >= n) {
                    swapIfGreater(ar1, ar2, left, right - n);
                }
                else if (left >= n) {
                    swapIfGreater(ar1, ar2, left - n, right - n);
                }
                else {
                    swapIfGreater(ar1, ar2, left, right);
                }
                left++, right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}