#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    char C[10];
    for (int i=0; i<10; i++){
        cin >> C[i];
    }

    for(int i=9; i>=0; i--){
        cout << C[i];
    }
    return 0;
}