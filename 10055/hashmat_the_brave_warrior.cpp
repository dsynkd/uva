#include <iostream>
#include <cmath>
using namespace std;
int main() {
	while(true) {
		int a,b;
		cin >> a >> b;
		if(cin.eof()) return 0;
		cout << abs(b-a) << endl;
	}
}
