#include <stdio.h>

int main() {
	float a, res = 1;
	int b, i;

	scanf_s("%f %d", &a, &b);
	for (i = 0; i < b; i++) {
		res *= a;
	}
	printf("%lf", res);

	return 0;
}