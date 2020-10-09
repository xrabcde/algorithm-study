#include <stdio.h>

int main() {
	int n;
	int unit[8] = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10};
	scanf("%d", &n);

	for (int i = 0; i < 8; i++) {
		if (n > unit[i]) {
			n -= n % unit[i];
			n += unit[i];
		}
		if (n > unit[i - 1]) {
			n -= n % unit[i - 1];
			n += unit[i-1];
		}
	}
	printf("%d\n", n);

	return 0;
}