#include <stdio.h>

int main() {
	int c, i, n, sum, count;
	double avg;
	scanf_s("%d", &c);                 //�׽�Ʈ ���̽��� ���� c �Է�

	while (c--) {
		scanf_s("%d", &n);             //�л��� �� n �Է�
		sum = 0;                     //sum�� 0���� �ʱ�ȭ
		int arr[1000];
		for (i = 0; i < n; i++) {
			scanf_s("%d", &arr[i]);    //�л� �� n��ŭ ���� �Է�
			sum += arr[i];
		}
		avg = (double)sum / n;       //��� = ����/�л���
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