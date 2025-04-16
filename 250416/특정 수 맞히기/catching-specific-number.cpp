#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int i;
    while(i != 25){
        cin >> i;
        if(i < 25){
            cout << "Higher\n";
        }else if(i>25){
            cout << "Lower\n";
        }

    }
    cout << "Good";
    return 0;
}