#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int tt;
	cin >> tt;
	while (tt--) {
		int n, k;
		cin >> n >> k;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a;
			cin >> a;
			if (a != 1) {
				cnt++;
			}
		}
		cout << (cnt <= k ? "YES": "NO") << '\n';
	}
	return 0;
}
