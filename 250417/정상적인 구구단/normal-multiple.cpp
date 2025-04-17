#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int N;
    cin >> N;
    
    for(int i=1;i<N+1;i++){
        for(int j=1; j<N+1; j++){
            if(j == N){
                cout << i << " * " << j << " = " << i*j;
            }else{
                cout << i << " * " << j << " = " << i*j << ", ";
            }
        }
        cout << endl;
    }
    return 0;
}