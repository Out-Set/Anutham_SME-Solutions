#include<iostream>
using namespace std;

class memberType {
    string name;
    int id,numBooksBought;
    double amountSpent;

    public:
    memberType(string n, int i, int no, double amt){
        name=n;
        id=i;
        numBooksBought=no;
        amountSpent=amt;
    }

    void setName(string n) {
        name=n;
    }

    string getName() {
    return name;
    }

    void setID(int i) {
        id=i;
    }

    int getID() {
        return id;
    }

    void setNumberBooksBought(int no) {
        numBooksBought=no;
    }

    int getNumberBooksBought() {
        return numBooksBought;
    }

    void setAmountSpent(double amt) {
        amountSpent=amt;
    }

    double getAmountSpent() {
        return amountSpent;
    }
};

int main() {
    memberType m("Pravin",101,15,225.50);
    cout<<"Name: "<<m.getName()<<endl;
    cout<<"ID: "<<m.getID()<<endl;
    cout<<"Number of Books bought: "<<m.getNumberBooksBought()<<endl;
    cout<<"Amount spent: $"<<m.getAmountSpent()<<endl;
    return 0;
}