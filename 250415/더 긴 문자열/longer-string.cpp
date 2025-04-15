#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    string w1, w2;
    cin >> w1 >> w2;

    if (w1.length() > w2.length()){
        cout << w1 << " " << w1.length();
    } else if(w1.length() < w2.length()){
        cout << w2 << " " << w2.length();
    }else {
        cout << "same";
    }
    return 0;
}