#include <stdio.h>
#include <string.h>

char str[1000001];
char ans[1000001];
char bomb[37];

int str_len, bomb_len;

int main() {
	scanf_s("%s %s", str, bomb);

	str_len = strlen(str);
	bomb_len = strlen(bomb);

	int p = 0;
	for (int i = 0; i < str_len; ++i) {
		ans[p++] = str[i];

		if (ans[p - 1] == bomb[bomb_len - 1]) {
			if (p - bomb_len >= 0) {
				bool chk = false;
				for (int i = 0; i < bomb_len; ++i) {
					if (ans[p - 1 - i] != bomb[bomb_len - 1 - i]) {
						chk = true;
						break;
					}
				}

				if (!chk) {
					p -= bomb_len;
				}
			}
		}
	}
	if (p == 0)
		printf("FRULA");
	else {
		ans[p] = '\0';
		printf("%s", ans);
	}
}
