#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b, c;
    cin >> a >> b;

    cout << a << " " << b << " ";
    for (int i =0; i<10; i++){
        // cout << (a + b)%10 << " ";
        a = b;
        b = (a + b)%10;
    }
    return 0;
}