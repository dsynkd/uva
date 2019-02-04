#include <iostream>
#include <cmath>
using namespace std;
int main() {
	while(true) {
		int a,b,c,d;
		cin >> a >> b >> c >> d;
		if(a == 0 && b == 0 && c == 0 && d == 0) return 0;
		cout << (abs(a-b) + abs(b-c) + abs(c-d)) * 15 << endl;
	}
}
