#include <stdio.h>

int main() {
	int arr[10];
	int arr2[42] = { 0, };

	int num = 0;
	int cnt = 0;

	for (int i = 0; i < 10; i++) {
		scanf("%d", &arr[i]);
		num = arr[i] % 42;
		arr2[num]++;
	}
	for (int i = 0; i < 42; i++)
		if (arr2[i] > 0) cnt++;

	printf("%d", cnt);
	return 0;
}