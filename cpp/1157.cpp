#include <stdio.h>
#include <ctype.h>

int main() {
	char word[1000001];
	int alphabetCnt[26] = { 0, };
	scanf("%s", word);
	for (int i = 0; word[i] != '\0'; i++)
		alphabetCnt[toupper(word[i]) - 'A']++;
	int max = 0; char c = '?';
	for (int i = 0; i <= 'Z' - 'A'; i++) {
		if (alphabetCnt[i] > max) {
			max = alphabetCnt[i];
			c = i;
		}
		else if (alphabetCnt[i] == max) c = '?';
	}
	putchar((c == '?') ? '?' : c + 65);
	return 0;
}