#include <iostream>
int main () {
    int a, b; 
    std::cin >> a >> b; 

    int ans = 1; 
    for(int i=1; i<=b; i++) {
        ans = ans * a;
        std::cout<<ans<<std::endl;    
        // OUTPUT: 5 25 125
    }
    std::cout<<std::endl;

}

