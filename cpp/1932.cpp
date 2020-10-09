#include <stdio.h>

int max(int a, int b) { return a > b ? a : b; }
int main() {

	int n, m, sum = 0;
	int dp[500][500] = { 0, };
	int arr[500];

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
		for (int j = 0; j <= i; j++)
			scanf("%d", &dp[i][j]);

	for (int i = 1; i < n; i++) {
		for (int j = 0; j <= i; j++) {
			if (j == 0) dp[i][j] += dp[i - 1][j];
			else if (j == i) dp[i][j] += dp[i - 1][j - 1];
			else dp[i][j] = max(dp[i - 1][j - 1] + dp[i][j], dp[i - 1][j] + dp[i][j]);

			sum = max(sum, dp[i][j]);
		}
	}

	m = sum;
	arr[0] = dp[0][0];
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j <= i; j++) {
			if (dp[i][j] == m) {
				if (j == 0) m = dp[i - 1][j];
				else if (j == i) m = dp[i - 1][j - 1];
				else m = max(dp[i - 1][j - 1], dp[i - 1][j]);
				arr[i] = dp[i][j] - m;
				break;
			}
		}
	}
	printf("\n합 : %d\n", sum);
	printf("경로에 있는 수 : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}

	return 0;
}