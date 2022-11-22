#include<stdio.h>
#include <iostream>
using namespace std;

// defining the class
class sortedArray{
private:
    int* arr;
    int capacity;
    int size;
    void moveTowardFront (int index);
    void moveTowardEnd (int index);
public:
    sortedArray (int capacity);
    ~sortedArray ();
    void insert (int value);
    void remove (int value);
    void print () const;
};

// defining Constructor
sortedArray :: sortedArray (int cap)
:capacity (cap)
{
    arr = new int [capacity];
    size = 0;
}
// Destructor
sortedArray :: ~sortedArray ()
{
    delete arr; // release the dynamic memory allocated to array
}

// Inserting the member function
void sortedArray :: insert (int value)
{
    if (size == 0)
    {
        arr[0] = value;
        size++;
        return;
    }
    int index = 0;
    while (value > arr [index] && index < size)
    {
        index++;
    }
    moveTowardEnd (index);
    arr [index] = value;
    size++;
}
// Deleting the member function
void sortedArray :: remove (int value)
{
    int index = 0;
    while (value != arr[index] && index < size)
    {
        index++;
    }
    if (index == size)
    {
        cout << value << " is not in the list. ";
        cout << "No removal." << endl;
        return ;
    }

    moveTowardFront (index++);
    size--;
}
// Printing the member function
void sortedArray :: print () const
{
    // printing each element followed by a space
    for(int i=0;i<size;i++)
        cout<<arr[i]<<" ";
    cout<<endl; // display a new line at the end
}
// Helper function to move the elements of array towards end
void sortedArray :: moveTowardEnd (int index)
{
    // loop to move elements from index to end 1 position to the right
    for(int i=size;i>index;i--)
        arr[i] = arr[i-1];
}
// function to move the elements of array towards from
void sortedArray :: moveTowardFront (int index)
{
    // loop to move elements from index+1 to end 1 position to the left
    for(int i=index;i<size-1;i++)
        arr[i] = arr[i+1];
}

int main ()
{
    // Declaration of an array of capacity 25
    sortedArray array (25);
    // Inserting 10 elements and then printing array
    array.insert (66);
    array.insert (31);
    array.insert (20);
    array.insert (14);
    array.insert (22);
    array.insert (17);
    array.insert (78);
    array.insert (71);
    array.insert (63);
    array.insert (155);
    cout << "Printing array after insertions of 10 elements: " << endl;
    array.print ();
    cout << endl;

    // Removing three elements and then printing array
    array.remove (17);
    array.remove (63);
    array.remove (78);
    cout << "Printing array after removals of 3 elements: " << endl;
    array.print ();
    cout << endl;

    // Inserting two more elements and then printing array
    array.insert (9);
    array.insert (56);
    array.insert (51);
    cout << "Printing array after insertion of 3 new elements" << endl;
    array.print ();
    cout << endl;
    
    // Try to remove an element, which is not in the array
    array.remove (63);
    return 0;
}
