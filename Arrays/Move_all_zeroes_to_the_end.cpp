//brute force
vector<int> moveZeroes(int n, vector<int> a) {

    //s-1
    vector<int> temp;
    for(int i = 0; i < n; i++) {
        if(s[i] != 0) {
            temp.push_back(a[i]);
        }
    }
    //s-2
    int nz = temp.size();
    for(int i = 0; i < nz; i++) {
        a[i] = temp[i];
    }
    for(int i = nz; i < n; i++) {
        a[i] = 0;
    }

    return a;
}
//optimal
vector<int> moveoptimalzeroes(int n, vector<int> a) {

    int j = -1;
    for(int i = 0; i < n; i++) {
        if(a[i] == 0) {
            j = i;
            break;
        }
    }
    if(j == -1) return a;

    for(int i = j + 1; i < n; i++) {
        if(a[i] != 0) {
            swap(a[i], a[j]);
            j++;
        }
    }
}