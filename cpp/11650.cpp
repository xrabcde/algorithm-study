#include <cstdio>
#include <algorithm>

struct point {
	int x, y;
};

point p[100000];

bool comp(point const& a, point const& b) {
	if (a.x == b.x) return a.y < b.y;
	return a.x < b.x;
}

int main() {
	int i, n, x, y;
	scanf("%d", &n);
	for (i = 0; i < n; ++i) {
		scanf("%d %d", &x, &y);
		p[i] = { x, y };
	}
	std::sort(p, p + n, comp);
	for (i = 0; i < n; ++i) {
		printf("%d %d\n", p[i].x, p[i].y);
	}
	return 0;
}