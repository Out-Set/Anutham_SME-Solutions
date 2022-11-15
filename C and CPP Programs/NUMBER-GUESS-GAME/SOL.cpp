#include<iostream>
#include<fstream>
using namespace std;

// Main() method
int main()
{
    char name_of_file[]= "data.dat"; 
    
    // using ifstream for reading
    ifstream file_in(name_of_file);
    
    // If their is no file present with this name so this condition runs and shows message
    if(!file_in)
    {
        // It displays message as it
        cout<<"Sorry file not found "<<name_of_file;
        // For new line '/n'
        cout<<"\n";
        return 1;
    }
    
    // declaration of all the variables
    int j, k , l , Total_sum;

    // This loop takes one by one line and store the value in j,k,l variable
    while(file_in>>j>> k >>l)
    {
        // perform sum
        Total_sum= j+ k+l;
        cout<<"summation = " << Total_sum<<endl;
        
    }

    // Closing the file
    file_in.close();
    return 0;
}
