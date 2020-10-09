#include <stdio.h>
#include <queue>
#include <vector>
//https://blog.naver.com/swcunba/221915101781

using namespace std;
#define INF 100000001
#define MAXV 20004
vector < pair<int, int> > e_info[MAXV];//���� ���� ���� �����̳�. ���� �ε����� ���� ����, <���, ������> ���� ����. 
int dist[MAXV];//�ִ� ��� ��� ���� �迭. 

void dijkstra(int start) {//�μ��� ���� ������ �޴´�. 
	dist[start] = 0;//�ڱ� �ڽ����� ���� ����� 0.
	priority_queue<pair<int, int> > pq;//�켱 ���� ť ����ؼ� �� ����(�ִ���, ū ���� �������� �ֻ�� ��� ����)
	pq.push(make_pair(0, start));//���, ������ ť�� ����
	while (!pq.empty()) {
		int temp = pq.top().second;//���� ��带 ť�� �ֻ�� ����� ����. ������ ����. 
		int distance = -pq.top().first;//����� ���� ���� �ֻ�ܿ� ������ ����ȭ(-���̱� ������ ū ������ ���� ����. -���̸� ���� ū �ֵ��� �۾����Ƿ� ������ ������).
		pq.pop();//ť���� �ֻ�� ����. 
		if (dist[temp] < distance) continue;//�ִ� �Ÿ� �ƴ� ��� ��ŵ.
		for (int i = 0; i < e_info[temp].size(); i++) {//���� ��� �ϳ��� Ȯ��.
			//���õ� ����� ���� ���
			int next = e_info[temp][i].second;
			//���õ� ��� ���ļ� ���� ���� ���� �� ���(���õ� ������ ��� �ּ� ��� + ������ ������ ���� ���)
			int nextDistance = distance + e_info[temp][i].first;
			//���� �ּ� ��뺸�� ���� �� �۴ٸ� �ּڰ��� ��ü
			if (nextDistance < dist[next]) {
				dist[next] = nextDistance;
				pq.push(make_pair(-nextDistance, next));//���� �� �켱�ǵ��� ����ȭ
			}
		}
	}
}

int main(void) {
	int v, e, s;//���� ����, ���� ����, ������. 
	int u, d, w;//���� ����, ���� ����, ���. 
	scanf("%d %d", &v, &e);//���� ������ ���� ���� �Է�.
	scanf("%d", &s); //���� ���� �Է�.
	for (int i = 1; i <= v; i++) {
		dist[i] = INF;//����� �� ������ INF. 
	}
	for (int i = 0; i < e; i++) {
		scanf("%d %d %d", &u, &d, &w);
		e_info[u].push_back(make_pair(w, d));//�����, ������, ��� ���� �Է� 
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