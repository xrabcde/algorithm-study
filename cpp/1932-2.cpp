//#include <stdio.h>
//
//int N;
//int tri[500][500];
//int dp[500][500];
//int max(int a, int b) { return a > b ? a : b; }
//
//int findMax() {
//	for (int i = N - 1; i > 0; i--) {
//		for (int j = 1; j <= N; j++) {
//			dp[i][j] = max(dp[i + 1][j], dp[i + 1][j + 1]) + tri[i][j];
//		}
//	}
//
//	return dp[1][1];
//}
//
//int main() {
//	scanf("%d", &N);
//
//	for (int i = 1; i <= N; i++) {
//		int j = 1;
//		while (i >= j) {
//			scanf("%d", &tri[i][j]);
//			j++;
//		}
//	}
//	printf("\n");
//	//dp √ ±‚»≠
//	for (int i = 1; i <= N; i++) {
//		dp[N][i] = tri[N][i];
//	}
//
//	printf("\n%d\n", findMax());
//
//}