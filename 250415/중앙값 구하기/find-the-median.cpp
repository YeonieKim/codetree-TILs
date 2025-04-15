#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int A, B, C;
    cin >> A >> B >> C;

    if (A > B){
        if (B > C){
            cout << B;
        }else { //B<C
            if (A > C){
                cout << C;
            }else {
                cout << A;
            }
        } 
    }else { //A <B
        if(A > C){ // B > A > C
            cout << A;
        }else { //A<C
            if(B < C){ // A < B < C
                cout << B;
            }else{
                cout << C;
            }
        }
    }

    return 0;
}