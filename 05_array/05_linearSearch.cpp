#include <iostream>
using namespace std; 

    bool search(int arr[], int size, int key){
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
            return 1;
            }
        }
        return 0;
    }


int main() {
    int arr[10] = {1, 2, 3, 4, 5, 6, 8, 7, 9, 10};

    cout<<"Enter that number you Want to search :" <<endl;
    int key;
    cin >> key;

    bool found = search(arr, 10, key);

    if (found){
        cout<<"Key is present in Element" <<endl;
    }
    else{
        cout<<"Key is not present in Element" <<endl;
    }
    return 0;
}

