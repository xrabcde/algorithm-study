#include <stdio.h>
#define MAXN 1000
#define INF 100000001

//https://hanstemcell.tistory.com/entry/%EB%8B%A4%EC%9D%B5%EC%8A%A4%ED%8A%B8%EB%9D%BC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC
/*
n : 노드의 개수, m : 버스 노선의 수
source : 출발지, destination : 목적지
adj[][] : 인접행렬
dist[] : 출발지로부터의 최소 비용
*/
int n, m, start, end;
int adj[MAXN + 1][MAXN + 1];
long long dist[MAXN + 1];

void input() {
	int from, to, w;
	scanf("%d", &n);
	scanf("%d", &m);

	// 인접행렬을 모두 무한대 거리로 만든다.
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			adj[i][j] = INF;

	for (int i = 0; i < m; i++) {
		scanf("%d %d %d", &from, &to, &w);

		// ** A->B로 가는 버스가 여러대일 수 있다.
		if (adj[from][to] > w || adj[from][to] == 0)
			adj[from][to] = w;
	}
	scanf("%d %d", &start, &end);
}

void dikstra() {
	// Q : 방문지, 의사코드와 동일
	int Q[MAXN + 1], Q_Size = n;

	for (int v = 1; v <= n; v++) {
		dist[v] = INF;
		Q[v] = 0;
	}

	dist[start] = 0;

	while (Q_Size != 0) {
		int min_dst = INF, u;
		long long alt;

		for (int v = 1; v <= n; v++) {
			if (Q[v] == 0 && dist[v] < min_dst) {
				min_dst = dist[v];
				u = v;
			}
		}
		Q[u] = 1;
		Q_Size--;

		for (int v = 1; v <= n; v++) {
			if (adj[u][v] == INF) continue;

			alt = dist[u] + adj[u][v];
			if (alt < dist[v]) dist[v] = alt;
		}
	}
}

int main()
{
	input();
	dikstra();

	printf("%lld\n", dist[end]);
	return 0;
}