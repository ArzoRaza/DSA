#include <iostream>
using namespace std;

int main() {
    // int a = 10;
    // int b = 30;

    // if (a>b){
    //     cout<<"A bara hai Compare to B" << endl;
    // }else{
    //     cout<< "B Bara hai compare to A" << endl;
    // }
        
    // int a, b;
    // cin>>a >> b;

    // cout<< "Value of a: "<< a << " And b: " << b << endl;

    // int a = cin.get();  // it take any thing you that you haved given. 

    // cout<<"Value of a is : "<< a << endl;

    /*
    int age;

    cout << "Enter your age: "<< endl;
    cin>> age;
    // cout<< "Enter number of B: "<< endl;
    // cin>> b;

    if( age > 50){
        cout<< "App ab buddhe ho gye hai !!" << endl;
    }
    else if (age < 20){
        cout<< "Abhi khelo kudo maj karo" << endl;
    }
    else{
        cout << "Jawan lagte ho abhi tum " << endl;
    }
    

    int a = 5; 
    int b =a+2;

    if((a=6)==b){
        cout<<"Uper wala " <<a;
    } 
    else{
        cout<<"Niche wala " << a+1;
    }
    

   char enputValue;
   cin>>enputValue;
   if(islower(enputValue)) {
    cout<<"It is a lower case value" << endl;
   }
   else if(isupper(enputValue)){
    cout<<"It is a Upper case Value" << endl;
   }
   else if(isdigit(enputValue)){
    cout<<"It is a numeric value" << endl;
   }
   else {
    cout<<"It value maybe combination of unique symbols" ;
   }
   


    // while loop in cpp language 

    int a = 1;
    // cin>>a;

    while(a<=10){
        cout<<a<<endl;
        a++;
    }
    

    int sum = 0; 
    int i=1;
    // int n = 5;
    // cin>>n;

    while(i%5==0){
        sum = sum+i;
        i++;

    }
        cout<<" Sum of all number's " << sum;

    

    int n = 10, sum=0;
    // cout<<" Enter a Even number " <<endl;
    // cin>>n;
    for(int i=2; i<=10;i+=2){
        cout<<"value of i: "<<i<<endl;
        sum+=i;
        cout<< "first line: "<<sum<<endl;
    }
    cout<<"Sum of even number"<<sum <<endl;
*/

    int n, i=1;
    cin>>n;

    while(i<=n){
        int j=1;
        while(j<=n){
            cout<<"*";
            j=j+1;
        }
        cout<<endl;
        i=i+1;
    }


}