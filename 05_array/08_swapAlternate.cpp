#include <iostream>
using namespace std;

void swapAlt(int arr[], int n){
    for(int i = 0; i < n; i++)
    {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = temp;
    }
}

int main(){
    int n;
    cout<< "Enter the size of array" << endl;
    cin >> n;

    int arr[n];
    cout << "Enter "<< n << "Element in array" << endl;
    for (int i = 0; i < n; i++)
    {
        cin>> arr[i];
    }

    swapAlt(arr, n);
    for (int i = 0; i < n; i++)
    {
        cout<< arr[i] << "  ";
    }

}