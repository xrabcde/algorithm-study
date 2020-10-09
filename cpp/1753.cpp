#include <stdio.h>
#include <queue>
#include <vector>
//https://blog.naver.com/swcunba/221915101781

using namespace std;
#define INF 100000001
#define MAXV 20004
vector < pair<int, int> > e_info[MAXV];//간선 정보 담을 컨테이너. 원소 인덱스가 시작 정점, <비용, 도착점> 으로 구성. 
int dist[MAXV];//최단 경로 비용 담을 배열. 

void dijkstra(int start) {//인수로 시작 정점을 받는다. 
	dist[start] = 0;//자기 자신으로 가는 비용은 0.
	priority_queue<pair<int, int> > pq;//우선 순위 큐 사용해서 힙 형성(최대힙, 큰 값을 기준으로 최상단 노드 형성)
	pq.push(make_pair(0, start));//비용, 시작점 큐에 삽입
	while (!pq.empty()) {
		int temp = pq.top().second;//현재 노드를 큐의 최상단 노드라고 설정. 시작점 먼저. 
		int distance = -pq.top().first;//비용이 작은 값이 최상단에 오도록 음수화(-붙이기 전에는 큰 값들이 위에 있음. -붙이면 절댓값 큰 애들이 작아지므로 밑으로 내려감).
		pq.pop();//큐에서 최상단 꺼냄. 
		if (dist[temp] < distance) continue;//최단 거리 아닌 경우 스킵.
		for (int i = 0; i < e_info[temp].size(); i++) {//인접 노드 하나씩 확인.
			//선택된 노드의 인접 노드
			int next = e_info[temp][i].second;
			//선택된 노드 거쳐서 인접 노드로 가는 총 비용(선택된 노드까지 드는 최소 비용 + 인접된 노드까지 가는 비용)
			int nextDistance = distance + e_info[temp][i].first;
			//기존 최소 비용보다 값이 더 작다면 최솟값을 교체
			if (nextDistance < dist[next]) {
				dist[next] = nextDistance;
				pq.push(make_pair(-nextDistance, next));//작은 값 우선되도록 음수화
			}
		}
	}
}

int main(void) {
	int v, e, s;//정점 개수, 간선 개수, 시작점. 
	int u, d, w;//시작 정점, 도착 정점, 비용. 
	scanf("%d %d", &v, &e);//정점 개수와 간선 개수 입력.
	scanf("%d", &s); //시작 정점 입력.
	for (int i = 1; i <= v; i++) {
		dist[i] = INF;//연결된 거 없으면 INF. 
	}
	for (int i = 0; i < e; i++) {
		scanf("%d %d %d", &u, &d, &w);
		e_info[u].push_back(make_pair(w, d));//출발점, 도착점, 비용 정보 입력 
	}
	dijkstra(s);
	for (int i = 1; i <= v; i++) {
		if (dist[i] == INF) {
			printf("%s\n", "INF");
		}
		else printf("%d\n", dist[i]);
	}
	return 0;
}