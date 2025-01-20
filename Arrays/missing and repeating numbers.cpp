//pure mathematical approach T.C.-> O(n)  S.C.-> O(n)

vector<int> findMissingRepeatingNumbers(vector <int> a) {
    long long n = a.size();
    //s - sn = x - y
    //s2 - s2n
    long long  SN = (n * (n + 1)) / 2;
    long long  S2n = (n * (n + 1) * (2n + 1)) / 2;
    long long  S = 0, S2 = 0;
    for (int i = 0; i < n; i++) {
        S += a[i];
        S2 = (long long)a[i] * (long long)a[i];
    }
    int vali = S - SN; //x - y
    int vals = S2 - S2n;
    vals = vals / vali; //x + y
    long long x = (vali + vals) / 2;
    long long y = x - vali;
    return {(int)x, (int)y};
}