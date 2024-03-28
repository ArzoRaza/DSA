#include <iostream>
using namespace std;

int main() {
    int a, b;
    
    cout<<"Enter First number" <<endl;
    cin>>a;

    cout<<"Enter Second number" <<endl;
    cin>>b;

    char operation;
    cout<<"Enter your Operation" <<endl;
    cin>> operation;

    switch (operation) {
        case '+': cout<< a + b << endl;
        break;

        case '-' : cout<< a - b << endl;
        break;

        case '*' : cout<< a * b <<endl; 
        break; 

        case '/' : cout<< a / b << endl;
        break; 

        case '%' : cout<< a % b << endl; 
        break; 

        default : cout<< "Please Enter a Valide Operation" << endl;
    
    }
}