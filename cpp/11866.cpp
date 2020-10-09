#include <iostream>
#include <queue>
using namespace std;

int main() {
	int N, M;
	queue<int> Q;
	cin >> N >> M;
	for (int i = 1; N >= i; i++) {
		Q.push(i);
	}
	cout << "<";
	while (!Q.empty()) {
		for (int i = 0; i < M - 1; i++) {
			Q.push(Q.front());
			Q.pop();
		}
		cout << Q.front();
		Q.pop();
		if (!Q.empty()) {
			cout << ", ";
		}
	}
	cout << ">" << endl;
	return 0;
}
