#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int a[n], b[n];
    int sum;
    for(int i=0; i<n; i++){
        cin >> a[i] >> b[i];
    } 

    for (int k=0; k<n; k++){
        sum = 0;
        for(int j=a[k]; j<=b[k]; j++){
            if(j%2==0){
                sum += j;
            }
        }
        cout << sum << endl;
    }
 
    return 0;
}