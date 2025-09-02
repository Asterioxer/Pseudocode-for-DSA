import java.util.Collections;
import java.util.List;

public class minmaxsum {
public static void miniMaxSum(List<Integer> arr) {
Collections.sort(arr);
long min = 0;
long max = 0;

for (int i = 0; i < arr.size() - 1; i++) {
   min += arr.get(i);
}    

for (int i = arr.size() -1 ; i > 0 ; i--) {
   max += arr.get(i);
}

System.out.println(min + " " + max);

}
}
