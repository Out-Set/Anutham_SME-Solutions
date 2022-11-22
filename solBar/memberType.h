#include <iostream>
#include <string>
#include <fstream>
using namespace std;

class memberType {
    string name;
    int member_id, no_of_books_bought;
    double amount_spent;

public:
    //constructor
    memberType(string name, int member_id, int n, double amount) {
        this -> name = name;
        this -> member_id = member_id;
        this -> no_of_books_bought = n;
        this -> amount_spent = amount;
    }

    //to set/update/modify name
    void setName(string name) {
        this -> name = name;
    }

    //display name
    void showName() {
        cout << this -> name << endl;
    }

    //to set/update/modify no of books bought
    void setNoOfBooksBought(int no) {
        this -> no_of_books_bought = no;
    }

    //displat no of books bought
    void showNoOfBooksBought() {
        cout << this -> no_of_books_bought << endl;
    }

    //to set/update/modify amount
    void setAmountSpent(double amount) {
        this -> amount_spent = amount;
    }

    //display amount
    void showAmountSpent() {
        cout << this -> amount_spent << endl;
    }
};

