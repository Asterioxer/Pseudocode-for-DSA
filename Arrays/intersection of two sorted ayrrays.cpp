#include <bits/stdc++.h>
vector<int> findArrayintersection(vector<int> &A, int n, vector<int> &B, int m) {
    int i = 0, j = 0;
    vector<int> answer;
    while (i < n && j < m) {
        if (A[i] < B[j]) {
            i++;
        }
        else if (A[i] > B[j]) {
            j++;
        }
        else {
            answer.push_back (A[i]);
            i++;
            j++;
        }
    }
  return answer;
}

//T.C. = O(n+m) in the worst case
//S.C. = O(1)