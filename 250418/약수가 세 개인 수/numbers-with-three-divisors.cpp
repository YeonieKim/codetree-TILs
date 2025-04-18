#include <iostream>

using namespace std;

int s, e;

int main() {
    cin >> s >> e;

    // Please write your code here.
    int cnt =0;
    
    for(int i=s; i<=e; i++){
        for(int j=1; j<=i; j++){
            if(i % j == 0){
                cnt++;
            }
        }
    }
    cout << cnt;
    return 0;
}
