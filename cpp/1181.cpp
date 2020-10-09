#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

bool comp(const string& s1, const string& s2) {

	if (s1.size() == s2.size()) {  //사이즈가 같으면 사전순 앞으로
		return s1 < s2;
	}
	return s1.size() < s2.size();  //사이즈가 다르면 작은 게 앞으로
}

int main(void) {
	vector<string> v;

	int n;
	cin >> n;

	string str;

	for (int i = 0; i < n; i++) {
		cin >> str;
		v.push_back(str);
	}
	vector<string>::iterator iter;
	vector<string>::iterator end_iter;

	sort(v.begin(), v.end(), comp);

	end_iter = unique(v.begin(), v.end());

	for (iter = v.begin(); iter != end_iter; iter++) {
		cout << *iter << endl;
	}

	return 0;
}