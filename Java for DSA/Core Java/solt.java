import java.util.Scanner;

public class solt {

    public static String cc(int n, String rp) {
        for (int i = 0; i < n; i++) {
            char report = rp.charAt(i);
            if (report == '0') {
                // Player claims no wins
                if ((i > 0 && rp.charAt(i - 1) == '1') || (i < n - 1 && rp.charAt(i + 1) == '1')) {
                    return "YES";
                }
            } else {
                // Player claims at least one win
                if ((i > 0 && rp.charAt(i - 1) == '1') || (i < n - 1 && rp.charAt(i + 1) == '1')) {
                    continue;
                }
                
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine(); 
            String rp = sc.nextLine().trim();
            System.out.println(cc(n, rp));
        }

        sc.close();
    }
}