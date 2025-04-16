#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int arr[10];
    int cnt3 = 0;
    int cnt5 = 0;

    for (int i=0; i<10; i++){
        cin >> arr[i];
    }

    for (int i=0; i<10; i++){
        if(arr[i] %3==0){
            cnt3 += 1;
            
        }
        if(arr[i]%5==0){
            cnt5 += 1;
        }
    }
    cout << cnt3 <<" " << cnt5;

    return 0;
}