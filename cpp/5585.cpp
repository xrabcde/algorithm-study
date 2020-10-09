#include <stdio.h>

int main() {
	int m, n, c, x, count = 0, total = 0;
	int type[6] = { 500, 100, 50, 10, 5, 1 };

	m = 1000;
	scanf("%d", &n);

	c = m - n; //°Å½º¸§µ· ÃÑ±Ý¾×

	for (int i = 0; i < 6; i++) {
		if (c >= type[i]) {
			count++;
			x = c / type[i];
			total += x;
			c -= x * type[i];
		}
	}

	printf("%d",total);
	return 0;
}