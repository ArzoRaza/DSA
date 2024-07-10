#include <iostream>
using namespace std; 

bool isEven(int a){
    if (a&1){
        return 0;
    }
    else{
        return 1;
    }
}


// int main () {
//     int number;
//     cin >> number;
    
//     if (isEven(number)){
//         cout<< "number is Even " <<endl;
//     }
//     else{
//         cout<< "Number is Odd" <<endl;
//     }
// }

int main () {
    int number;
    cin>>number;

    if (isEven(number)){
        cout<<"number is Even " <<endl;
    }
    else{
        cout<<"number is odd" <<endl;
    }
}