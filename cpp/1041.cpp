#define MIN2(A,B) (A < B ? A : B)
#define MIN3(A,B,C) (A < B && A < C) ? A : (B > C) ? C : B
#include <stdio.h>

int main() {
	int a[6], min1, min2, min3;
	int N, n1, n2, n3 = 4, b1, b2, sum = 0;

	scanf_s("%d", &N);
	for (int i = 0; i < 6; i++) {
		scanf_s("%d", &a[i]);
	}

	if (N == 1) {
		for (int i = 0; i < 6; i++)
			sum += a[i];
	}
	else {
		a[0] = MIN2(a[0], a[5]);
		a[1] = MIN2(a[1], a[4]);
		a[2] = MIN2(a[2], a[3]);
		
		b1 = MIN3(a[0], a[1], a[2]);
		if (b1 == a[0])
			b2 = MIN2(a[1], a[2]);
		else if (b1 == a[1])
			b2 = MIN2(a[0], a[2]);
		else
			b2 = MIN2(a[0], a[1]);

		min3 = a[0] + a[1] + a[2];
		min2 = b1 + b2;
		min1 = b1;

		n1 = (N - 1) * (N - 2) * 4 + (N - 2) * (N - 2);
		n2 = (N - 1) * 4 + (N - 2) * 4;

		sum += n1 * min1;
		sum += n2 * min2;
		sum += n3 * min3;
	}

	printf("%d", sum);

	return 0;
}