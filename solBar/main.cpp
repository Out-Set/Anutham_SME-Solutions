#include <iostream>
#include <string>
#include <fstream>
#include "memberType.h"

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    freopen("memberData.txt", "r", stdin);

    int n; cin >> n;
    while (n--) {
        string name, garbage;
        int id, no;
        double amount;
        cin >> id;
        getline(cin, garbage); //to take input from next line
        getline(cin, name);
        cin >> no;
        cin >> amount;

        memberType *member = new memberType(name, id, no, amount);

        //Before updation
        cout << "Before Updation" << endl;
        member -> showName();
        member -> showNoOfBooksBought();
        member -> showAmountSpent();

        //After updation (update with some dummy data)
        cout << "After Updation" << endl;
        member -> setName("John Doe");
        member -> showName();

        member -> setNoOfBooksBought(5);
        member -> showNoOfBooksBought();

        member -> setAmountSpent(10.0);
        member -> showAmountSpent();

        cout << endl;
    }

    return 0;

}

