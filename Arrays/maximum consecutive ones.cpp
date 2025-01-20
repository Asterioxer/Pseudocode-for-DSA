int consecutiveOnes(vector<int>& arr){
    int maxi = 0, cnt = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr[i] == 1) {
        cnt++;
        maxi = max(maxi, cnt);
      }
      else {
          cnt = 0;
      }
    }
    return maxi;
}