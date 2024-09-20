#include <iostream>
#include <cmath>

using namespace std;

int main() {
	float a, b, v, t;
	cin >> a;
	cin >> b;
	cin >> t;
	for (v = 0.05; v <= 0.21; v += 0.05) {
		float p = 0.0635 * t / (v - b) * 1.0 - a / pow(v, 2);
		cout << v << "    " << p << endl;
	}
	for (v = 0.2; v <= 1.1; v += 0.2) {
		float p = 0.0635 * t / (v - b) * 1.0 - a / pow(v, 2);
		cout << v << "    " << p << endl;
	}
}