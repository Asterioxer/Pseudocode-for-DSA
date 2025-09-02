//Brute Force Solution
// Time Complexity: O(n^3)
// import java.util.*;
// public class AbsCinema {
//     static final int MOD = 1000000007;

//     public static int sumofMarathonQualities(int[] scores) {
//         int n = scores.length;
//         long totalSm = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int minVal = Integer.MAX_VALUE;
//                 int maxVal = Integer.MIN_VALUE;

//                 for (int k = i; k <= j; k++) {
//                     minVal = Math.min(minVal, scores[k]);
//                     maxVal = Math.max(maxVal, scores[k]);
//                 }

//                 totalSm = (totalSm + (long) minVal * maxVal) % MOD;
//             }
//         }
//       return (int) totalSm;
//     }
//   public static void main(String[] args) {
//     int[] scores = {5, 9, 1, 2, 3};
//     System.out.println(sumofMarathonQualities(scores)); // Output: 22
//   }
// }


//Optimizing Brute Approach
// Time Complexity: O(n^2)

// import java.util.*;
// public class AbsCinema {
//     static final int MOD = 1000000007;

//     public static int sumMartQual(int[] scores) {
//         int n = scores.length;
//         long totalS = 0;

//         for (int start = 0; start < n; start++) {
//             int minV = Integer.MAX_VALUE;
//             int maxV = Integer.MIN_VALUE;

//             for (int end = start; end < n; end++) {
//                 minV = Math.min(minV, scores[end]);
//                 maxV = Math.max(maxV, scores[end]);

//                 totalS = (totalS + (long) minV * maxV) % MOD;
//             }    
//         }
//         return (int)totalS;
//     }
//   public static void main(String[] args) {
//     int[] scores = {5, 9, 1, 2, 3};
//     System.out.println(sumMartQual(scores)); // Output: 230
//   }
// }

// Optimizing further using Monotonic Stack
// Time Complexity: O(n)

// import java.util.*;
// public class AbsCinema {
//      static final int MOD = 1000000007;

//      public static int sumMartQual(int[] scores) {
//          int n = scores.length;
//          long totalS = 0;

//          int[] leftMin = new int[n];
//          int[] rightMin = new int[n];
//          int[] leftMax = new int[n];
//          int[] rightMax = new int[n];

//          Stack<Integer> minStack = new Stack<>();
//          for (int i = 0; i < n; i++) {
//             int cnt = 1;
//             while (minStack.isEmpty() && scores[minStack.peek()] > scores[i]) {
//                 cnt += leftMin[minStack.pop()];
//             }
//             leftMin[i] = cnt;
//             minStack.push(i);
//         }

//         minStack.clear();
//         for (int i = n - 1; i >= 0; i--) {
//             int count = 1;
//             while (!minStack.isEmpty() && scores[minStack.peek()] >= scores[i]) {
//                 count += rightMin[minStack.pop()];
//             }
//             rightMin[i] = count;
//             minStack.push(i);
//         }

//         Stack<Integer> maxStack = new Stack<>();
//         for (int i = 0; i < n; i++) {
//             int count = 1;
//             while (!maxStack.isEmpty() && scores[maxStack.peek()] < scores[i]) {
//                 count += leftMax[maxStack.pop()];
//             }
//             leftMax[i] = count;
//             maxStack.push(i);
//         }

//         maxStack.clear();
//         for (int i = n - 1; i >= 0; i--) {
//             int count = 1;
//             while (!maxStack.isEmpty() && scores[maxStack.peek()] <= scores[i]) {
//                 count += rightMax[maxStack.pop()];
//             }
//             rightMax[i] = count;
//             maxStack.push(i);
//         }

//         for (int i = 0; i < n; i++) {
//             totalS += (long) scores[i] * leftMin[i] * rightMin[i]; // Min contribution
//             totalS += (long) scores[i] * leftMax[i] * rightMax[i]; // Max contribution
//             totalS %= MOD;
//         }

//         return (int) totalS;
//     }


//     public static void main(String[] args) {
//         int[] scores = {2, 1, 3}; 
//         System.out.println(sumMartQual(scores)); 
//     }
// }


//optimizing further the solution using a single stack
import java.util.*;

public class AbsoluteCinemaOptimized {
    static final int MOD = 1_000_000_007;

    public static int sumOfMarathonQualities(int[] scores) {
        int n = scores.length;
        long totalSum = 0;
        
        int[] minContribution = new int[n];
        int[] maxContribution = new int[n];
        
        // Using a single stack for both min and max contributions
        Stack<Integer> stack = new Stack<>();

        // Compute minimum contributions
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack.isEmpty() && scores[stack.peek()] > scores[i]) {
                count += minContribution[stack.pop()];
            }
            minContribution[i] = count;
            stack.push(i);
        }

        stack.clear(); // Reset stack for max contributions

        // Compute maximum contributions
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack.isEmpty() && scores[stack.peek()] < scores[i]) {
                count += maxContribution[stack.pop()];
            }
            maxContribution[i] = count;
            stack.push(i);
        }

        // Compute final sum using min/max contributions
        for (int i = 0; i < n; i++) {
            totalSum += (long) scores[i] * minContribution[i]; // Min contribution
            totalSum += (long) scores[i] * maxContribution[i]; // Max contribution
            totalSum %= MOD;
        }

        return (int) totalSum;
    }

    public static void main(String[] args) {
        int[] scores = {2, 1, 3}; 
        System.out.println(sumOfMarathonQualities(scores)); // Output: 22
    }
}
