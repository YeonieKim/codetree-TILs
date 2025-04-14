#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a,b,c;
    cin >> a >> b >> c;

    int s = a + b + c;
    int m = s / 3;
    int x = s - m; 
    cout << s << "\n" << m << "\n" << x;
    return 0;
}