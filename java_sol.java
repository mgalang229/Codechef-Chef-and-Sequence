import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		for (int qq = 1; qq <= tt; qq++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				if (a != 1) {
					cnt++;
				}
			}
			System.out.println(cnt <= k ? "YES" : "NO");
		}
	}
}
