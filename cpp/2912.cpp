#include <cstdio>
#include <cstring>

int n, c, m;
int arr[300001], color[10001];

void find(int start, int end) {
	memset(color, 0, sizeof(color));
	int maximum = -1;
	int idx = -1;
	for (int i = start; i <= end; ++i)
	{
		color[arr[i]]++;
	}
	for (int i = 1; i <= c; ++i)
	{
		if (maximum < color[i]) {
			idx = i;
			maximum = color[i];
		}
	}
	if (maximum > (end - start + 1) / 2) {
		printf("yes %d\n", idx);
	}
	else {
		printf("no\n");
	}
}

int main(void)
{
	scanf_s("%d %d", &n, &c);
	for (int i = 1; i <= n; ++i)
		scanf_s("%d", &arr[i]);

	scanf_s("%d", &m);

	int a, b;

	for (int i = 1; i <= m; ++i) {
		scanf_s("%d %d", &a, &b);
		find(a, b);
	}

	return 0;
}


