#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int arr[4][4];
    for (int i =0; i<4; i++){
        for(int j=0; j <4; j++){
            cin >> arr[i][j];
        }
    }
    int sum =0;

    for(int k=0;k<4;k++){
        for(int l=0; l<4; l++){
            sum += arr[k][l];
        }
        cout << sum << endl;
         sum =0;
    }
    return 0;
}