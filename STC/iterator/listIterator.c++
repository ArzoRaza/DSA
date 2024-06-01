#include<bits/stdc++.h>
using namespace std;

int main()
{
    list<int> myList = {1, 2, 3, 4, 5};
    // list<int>::iterator itr;


    // if we define auto then we didn't have to define anythings other
    for(auto it = myList.begin(); it != myList.end(); ++it)
    std::cout << *it << " ";

    return 0;
}