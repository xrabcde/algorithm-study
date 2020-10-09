#include <stdio.h>

int main() {
	int n, k, top = 0;
	char c, stack[500000];
	
	scanf("%d%d", &n, &k);

	while (n--) {
		do {
			scanf("%c", &c);
		} while (c < 48 || 57 < c);

		while (k > 0 && top > 0 && stack[top - 1] < c) {
			top--; k--;
		}

		stack[top++] = c;
	}

	top -= k;
	stack[top] = 0;
	puts(stack);
}