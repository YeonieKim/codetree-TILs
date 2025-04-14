#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int A, B;
    cin >> A >> B;

    if(A >= B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }

    if(A > B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }

    if(A <= B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }

    if(A < B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }

    if(A == B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }

    if(A != B){
        cout << 1 << "\n";
    }else {
        cout << 0 << "\n";
    }
    return 0;
}