
import java.util.Scanner;

public class Solution {
	public static void solve(int n, int k, String str1, String str2) {
		if (n > k) {
			System.out.println("NO");
			return;
		}
		for (int i = 0; i < k - n + 1; i++) {
			int j = 0;
			for (j = 0; j < n; j++) {
				if (str2.charAt(i+j) != str1.charAt(j)) {
					break;
				}
			}
			if (j == n) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}
	
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int k = in.nextInt();
//		String str1 = in.next();
//		String str2 = in.next();
//		solve(n, k, str1, str2);
		
		solve(3, 11, "abc", "asdfasdfabc");
	}
}
