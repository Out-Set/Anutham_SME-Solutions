#include <iostream> 
#include <vector> 
#include <string>  
using namespace std;  
string GetPhoneNumber(vector<string> nameVec, vector<string> phoneNumberVec, string contactName) {     
    for (int i = 0; i < nameVec.size(); ++i) {         
        if (nameVec[i] == contactName)             
        return phoneNumberVec[i];     
    }     
    return "Contact doesn't exists!"; 
}  

int main() {     
    string userName, userNumber;     
    vector<string> names, phoneNumbers;     
    int n;     
    cin >> n;     
    for (int i = 0; i < n; ++i) {         
        cin >> userName >> userNumber;         
        names.push_back(userName);         
        phoneNumbers.push_back(userNumber);     
    }     
    cin >> userName;     
    cout << GetPhoneNumber(names, phoneNumbers, userName) << endl;     
    return 0; 
}
