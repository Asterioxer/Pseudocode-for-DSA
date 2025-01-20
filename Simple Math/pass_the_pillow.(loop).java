class Solution {
    public int passThePillow(int n, int time) {
        int currPillowPos = 1;
        int direction = 1;
        int currTime = 0;
        while (currTime < time) {
            if (0 < currPillowPos + direction && currPillowPos + direction <= n) {
                currPillowPos += direction;
                currTime++;
            } else {
                direction *= -1;
            }
        }
      return currPillowPos;
    }

    @Override
    public String toString() {
        return "Solution []";
    }
}