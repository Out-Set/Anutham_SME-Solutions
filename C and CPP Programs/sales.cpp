#include <iostream>
#include <fstream> 
#include <iomanip>
using namespace std;
int main(void)
{
    fstream fin, fout;

    // opening salesin.txt file in read mode
    fin.open("salesin.txt", ios::in); 

    // opening salesout.txt file in write mode
    fout.open("salesout.txt", ios::out);

    // if file is not opened correctly
    if(!fin || ! fout){
        cout << "Cannot open file" << endl; 
        return 0;
    }
    
    float buying, selling, profit_loss, t_profit = 0, t_loss = 0;
    int quantity;

    while(!fin.eof()){
        // reading a line of data from salesin.txt file
        fin >> buying >> selling >> quantity;

        // finding profit/loss for a particular data
        profit_loss = quantity *(selling - buying);

        // storing information in salesout.txt
        fout << fixed << setprecision(2);

        // Setting the precision for floating point numbers
        fout << buying << " " << selling << " " << quantity << ": ";

        // if there is a profit
        if(profit_loss > 0){
            // added to total profit
            t_profit += profit_loss;

            fout << "profit = " << profit_loss << ", ";
            fout << "total profit = " << t_profit << endl;
        }
        // if there is a loss
        else{
            profit_loss = -1;
            // added to total loss
            t_loss += profit_loss;

            fout << "loss = " << profit_loss << ", ";
            fout << "total loss = " << t_loss << endl;
        }
    }
    fin.close();
    fout.close();

    return 0;
}