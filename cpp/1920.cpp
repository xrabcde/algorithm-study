#include <iostream>
#include <algorithm>
using namespace std;

int binarysearch(int x, int* arr, int start, int end) {
	int mid = (start + end) / 2;
	if (start > end)
		return 0;
	if (arr[mid] == x)
		return 1;
	else if (arr[mid] > x)
		binarysearch(x, arr, start, mid - 1);
	else if (arr[mid] < x)
		binarysearch(x, arr, mid + 1, end);
}

int main(void) {
	//ios_base::sync_with_stdio(false); cin.tie(NULL);
	int n, m, x;
	int arr[100001];
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);
	sort(arr, arr + n);

	scanf("%d", &m);
	for (int i = 0; i < m; i++) {
		scanf("%d", &x);
		printf("%d\n", binarysearch(x, arr, 0, n - 1));
	}
	return 0;
}