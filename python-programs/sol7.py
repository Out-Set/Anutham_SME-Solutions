import sys
def fileop():
    try:
        f = open ( "sample.txt", 'r' )
        w = f.read().splitlines()#reading the files data in form of an array of integers
    except IOError as e:
        print (e)
        return w

 


if __name__ == "__main__":
    a=fileop()
    print("Output Lower Values\n")
    user=input("Enter The maximum value to be returned: ")
    try:
        print(f'The number {user}  is an integer')
    except ValueError as ve:
        print(f'You entered an irrational number')
    for i in range(len(a)):
        if(a[i] <= user):
            print (a[i])
    print("\nEnd of result\n")

