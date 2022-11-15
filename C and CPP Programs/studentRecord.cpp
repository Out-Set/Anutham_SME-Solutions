#include<iostream>
#include<string>
#include<stdlib.h>
#include<string.h>

int size;
using namespace std;

struct Student_Records {
   char id[100];
   char Name[100];
   char Course[100];
};

struct Student_Records array[10];

class student_Course {
    public:
    char id[100];
    char Name[100];
    char Course[100];
    
    public:
    student_Course() {
        cout<<"\nCreation of Records Done"<<endl;
        cout<<"\nConstructor is Invoked"<<endl;
    }

    public:
    ~student_Course() {
        cout<<"\nDestrcuting The Memory"<<endl;
    }

    public:
    int find(char name[]) {
        for(int i=1;i<=size;i++) {
            if(!strcmp(name,array[i].Name)) {
                return i;
            }
        }
        return -1;
    }

    public:
    void DisplayAllRecords() {
        cout<<"\nStudent_Name\t\tCourseId\t\tCourseName\n"<<endl;
        cout<<"--------------------------------------------"<<endl;
        for(int i=1;i<=size;i++) {
            cout<<array[i].Name<<"\t"<<array[i].id<<"\t"<<array[i].Course<<endl;
        }
    }

    public:
    void addStudentRecord() {
        size++;
        cout<<"\nEnter New Records Of Student:"<<endl;
        cout<<"----------------------------------"<<endl;
        cout<<"\nEnter The Student Name"<<endl;
        cin>>array[size].Name;
        cout<<"\nEnter The Student Id"<<endl;
        cin>>array[size].id;
        cout<<"\nEnter  The  Course Name:\n"<<endl;
        cin>>array[size].Course;
        cout<<"\nRecords Added Successfully"<<endl;
    }
};

// Main functio
int main() {
    student_Course obj;
    int option,retval;
    char name[100];
    cout<<"\n------------------------------------------"<<endl;
    cout<<"\nEnter The Size Of Records you want to Add:"<<endl;
    cin>>size;
    for(int i=1;i<=size;i++) {
        cout<<"\nEnter The Student Name"<<endl;
        cin>>array[i].Name;
        cout<<"\nEnter The Course Id"<<endl;
        cin>>array[i].id;
        cout<<"\nEnter  The Course Name:\n"<<endl;
        cin>>array[i].Course;
    }

    cout<<"\n*********Student Records**********"<<endl;
    while(true) {
        cout<<"-----------------------------------"<<endl;
        cout<<"\n******MENU*******"<<endl;
        cout<<"\n1.Add New Course Record:"<<endl;
        cout<<"\n2.Display All Course Records"<<endl;
        cout<<"\n3.Searching a Student Details"<<endl;
        cout<<"\n4.Deleting The All Records"<<endl;
        cout<<"\n5.Exit"<<endl;

        cout<<"\nSelect Any Option"<<endl;
        cin>>option;
        switch(option) {
            case 1:
                obj.addStudentRecord();
                break;
            case 2:
                obj.DisplayAllRecords();
                break;
            case 3:
                cout<<"\nEnter  The Student Name"<<endl;
                cin>>name;
                retval=obj.find(name);
                if(retval!=-1) {
                    cout<<"\nStudent_Name\t\tCourseId\t\tCourseName\n"<<endl;
                    cout<<"--------------------------------------------"<<endl;
                    cout<<array[retval].Name<<"\t\t"<<array[retval].id<<"\t\t"<<array[retval].Course<<endl;
                }
                else {
                    cout<<"\nThe Student Details are Not Found:"<<endl;
                }
                break;
            case 4:
                cout<<"\nMemory is Clear Please Insert The New Data"<<endl;
                delete array;
                break;
            case 5:
                exit(0);
            default:
                cout<<"\n!Invalid Option"<<endl;
        }
    }
}

