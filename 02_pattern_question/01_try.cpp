

#include <iostream>
using namespace std;

int main() {
    /*
    int n;
    cin>>n;
    // int counte = 1;

    int row = 1;
    while(row<=n){
        int col = 1;
        int val = row;
        while(col<=row){
            cout<< val;
            // counte = counte + 1;
            val = val + 1;
            col = col + 1;
        }
        cout<<endl;
        row = row + 1;
    }
    */


    int n;
    cin >> n; 

    int r = 1;
    while(r<=n){
        int c = 1;
        while(c<=r){
            cout<<(r-c+1);
            c = c + 1;
        }
        cout<<endl;
        r = r + 1;
    }
}


