#include <stdio.h>

int main() {
	int n, k;

	scanf("%d %d", &n, &k);
	int dp[1001][1001];
	for (int i = 0; i <= n; i++) {
		for (int j = 0; j <= k; j++) {
			if (i == j || j == 0) dp[i][j] = 1;
			else {
				dp[i][j] = (dp[i - 1][j - 1] % 10007) + (dp[i - 1][j] % 10007);
				dp[i][j] %= 10007;
			}
		}
	}
	printf("%d", dp[n][k]);
	return 0;
}