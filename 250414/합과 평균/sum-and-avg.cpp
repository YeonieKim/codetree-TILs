#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int A, B;
    cin >> A >> B;
    
    int m = A + B;
    double aver = (double)m/2;

    cout << fixed;
    cout.precision(1);
    cout << m << " " << aver;
    return 0;
}