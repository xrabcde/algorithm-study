#include <stdio.h>

struct Node {
	int value;
	int parent;
};

int main() {
	int n, p, k, root, ans = 0;
	static Node nodes[50];
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &p);
		nodes[i].parent = p;
		if (p == -1)
			root = i;
		else
			nodes[p].value++;
	}
	scanf("%d", &k);
	if (nodes[k].parent >= 0)
		nodes[nodes[k].parent].value--;
	nodes[k].parent = -2;
	for (int i = 0; i < n; i++) {
		if (nodes[i].value)
			continue;
		p = nodes[i].parent;
		while (p >= 0)
			p = nodes[p].parent;
		if (p == -1)
			ans++;
	}
	printf("%d\n", ans);
}