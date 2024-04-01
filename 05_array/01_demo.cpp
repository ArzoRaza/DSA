#include <iostream>
using namespace std;


void printArray(int arr[], int size) {
    cout<<"Print the array" << endl;

    for(int i = 0; i<size; i++){
        cout<<arr[i] << ""; 
    }
    cout<<"Printing Done" << endl;
}


int main(){

    // declare array
    // int arr[14] = {1, 2, 3, 4, 5};
    int number[15];

    // accessing array
    cout<< "Chalo check kare :" << number[14]  << endl;

    // int n = 4;
    // for ( int i = 0; i<=n; i++) {
    //     cout<< arr[i] <<endl;
    // }
    int results[15] = {5,6,7};
    int nullVal = 5; 
    for (int i = 0; i<=nullVal; i++){
        cout<< results[i] <<endl;
    }
    
    int fourth[10] = {0};

    int n = 10;
    cout<< "Printing the array" <<endl;
    for(int i = 0; i<n; i++) {
        cout<<fourth[i]<< "";
    }

    int fifth[10]={1};
    n= 10;
    cout<<"Printing the array" <<endl;
    for(int i = 0; i<n; i++) {
        cout << fifth[i] << "";
    }
    cout << endl << "Everything is Fine" << endl << endl;

    return 0;
}