#include <iostream> 
using namespace std;

int main() {
    int money = 3330;

    switch (money) {
        case 100 : cout<< "Only One Hundred " << endl;
            break;
        case 200 : cout<< "We need Two notes of Hundred" <<endl;
            break;
        case 300 : cout<< "We need Three notes of Hundred" <<endl;
            break; 
        case 400 : cout<< "We need four notes of Hundred" <<endl;
            break; 
        case 500 : cout<< "We need Five notes of Hundred" <<endl;
            break; 
        case 600 : cout<< "We need Six notes of Hundred" <<endl;
            break; 
        case 700 : cout<< "We need Seven notes of Hundred" <<endl;
            break; 
        case 800 : cout<< "We need Eight notes of Hundred" <<endl;
            break;
        case 900 : cout<< "We need Nine notes of Hundred" <<endl;
            break; 
        case 1000 : cout<< "We need Ten Notes of Hundred" <<endl;
            break;  
        case 3330 : cout<< "We need Thirty Three Notes of Hundred and Thirty Rupees" <<endl;
            break;
        default : cout<< "Please Input correct Amount" <<endl;
    }
}