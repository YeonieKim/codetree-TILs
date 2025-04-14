#include <iostream>
using namespace std;

int main() {
    int m = 13;
    double ratio =0.165;

    cout << fixed;
    cout.precision(6);
    cout << m << " * " << ratio << " = " << m * ratio;

    return 0;
}