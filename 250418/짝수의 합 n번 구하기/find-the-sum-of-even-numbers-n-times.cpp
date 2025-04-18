#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int a[n], b[n];
    for(int i=0; i<n; i++){
        cin >> a[i] >> b[i];
    }

    int sum[n];
    for (int k=0; k<n; k++){
        for(int j=a[k]; k<=b[k]; j++){
            if(j%2==0){
                sum[k] += j;
            }
        }
    }

    for(int i=0;i<n;i++){
        cout << sum[i] << endl;
    }
    return 0;
}