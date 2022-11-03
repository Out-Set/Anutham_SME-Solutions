# ceating a list of numbers
List = [23,12,57,30,2,13]

# to find the smallest number in list
small = List[0]
for i in List:
    if(small > i):
        small = i

print("Smallest number is: ", small)

