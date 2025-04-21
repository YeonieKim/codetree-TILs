#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a[4][4];
    int sum = 0;

    for(int i=0;i<4;i++){
        for(int j=0; j<4; j++){
            cin >> a[i][j];
        }
    }

    for(int i=0;i<4;i++){
        for(int j=0; j<4; j++){
            sum += a[i][j];
            if(i==j){
                break;
            }
        }
    }
    cout << sum;
    return 0;
}