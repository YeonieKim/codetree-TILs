#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    int a=1;

    for(int i=1; i<n+1; i++){
        for(int j=0; j<i; j++){
            cout << a << " ";
            a++;
        }
        cout << endl;
    }
    return 0;
}