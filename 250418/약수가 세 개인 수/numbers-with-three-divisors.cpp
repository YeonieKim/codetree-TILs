#include <iostream>

using namespace std;

int s, e;

int main() {
    cin >> s >> e;

    // Please write your code here.
    int cnt = 0;
    int d = 0;
    
    for(int i=s; i<=e; i++){
        cnt = 0;
        for(int j=1; j<=i; j++){
            if(i % j == 0){
                cnt++;
            }
        }
        if(cnt == 3){
            d++;
        }
    }
    
    cout << d;
    return 0;
}
