#include <stdio.h>

int main() {
	int c, i, n, sum, count;
	double avg;
	scanf_s("%d", &c);                 //테스트 케이스의 개수 c 입력

	while (c--) {
		scanf_s("%d", &n);             //학생의 수 n 입력
		sum = 0;                     //sum을 0으로 초기화
		int arr[1000];
		for (i = 0; i < n; i++) {
			scanf_s("%d", &arr[i]);    //학생 수 n만큼 점수 입력
			sum += arr[i];
		}
		avg = (double)sum / n;       //평균 = 총점/학생수
		count = 0;
		for (i = 0; i < n; i++) {
			if (arr[i] > avg) {
				count++;
			}
		}
		printf("%.3lf%%\n", (double)count / n * 100);
	}

	return 0;
}