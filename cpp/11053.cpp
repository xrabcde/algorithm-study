#include <stdio.h>

int max(int a, int b) { return a > b ? a : b; }
int main() {

	int n, ans = 0, count = 1;
	int dp[1000];
	int arr[1000];

	scanf("%d", &n);

	for (int i = 0; i < n; i++) scanf("%d", &arr[i]);
	for (int i = 0; i < n; i++) {
		dp[i] = 1;
		for (int j = 0; j < i; j++) {
			if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
				dp[i] = dp[j] + 1;
			}
		}
	}

	for (int i = 0; i < n; i++)
		ans = max(ans, dp[i]);
	printf("\n길이 : %d\n수열 : [ ", ans);

	for (int i = 0; i < n; i++) {
		if (count == dp[i]) {
			printf("%d ", arr[i]);
			count++;
		}
	}
	printf("]\n");
	return 0;
}