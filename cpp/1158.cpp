#include <stdio.h>

void josae() {
	int N, K, i, j = 1, cnt;
	int arr[5001] = { 0 };

	scanf_s("%d %d", &N, &K);
	printf("<");

	for (i = 0; i < N; i++) {
		cnt = 0;
		while (1) {
			if (arr[j] == 0)
				cnt++;
			if (cnt == K) {
				arr[j] = -1;
				if (i == N - 1)
					printf("%d>", j);
				else
					printf("%d, ", j);
				break;
			}
			j++;
			if (j > N)
				j = 1;
		}
	}
}

int main() {
	josae();
}