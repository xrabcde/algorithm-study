#include <stdio.h>

int main() {
	int arr[7] = { 0 }, sum = 0, mins[7], min, count = 0;

	for (int i = 0; i < 7; i++) {
		scanf("%d", &arr[i]);
		if (arr[i] % 2 == 1) {
			sum += arr[i];
			mins[count] = arr[i];
			count++;
		}
	}
	min = mins[0];
	for (int i = 1; i < count; i++) {
		if (min > mins[i])
			min = mins[i];
	}

	if (count == 0) {
		printf("-1\n");
	}
	else {
		printf("%d\n%d", sum, min);
	}
	return 0;
}