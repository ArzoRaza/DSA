#include <iostream>
using namespace std;

int main () {
    int a, b = 1;
    a = 10;
    if(++a) {
        cout<< b;
    }
    else{
        cout<< a;
    }


    int a = 1; 
    int b = 2;

    if(a-- > 0 && b++ > 2 ){
        cout<< "Stage one " << endl;
    }
    else{
        cout<< "Stage two" <<endl;
    }
    cout<< a <<" " << b << endl;



    int num = 3;
    cout<<(25*(++num));


    int a = 1;
    int b = a++;
    int c = ++a;
    cout<< b << endl; 
    cout<< c <<endl;


}