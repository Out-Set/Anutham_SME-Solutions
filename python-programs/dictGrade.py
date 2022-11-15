import random
from tabulate import tabulate
#select the marks
gradePoints = {"A":4,"B":3,"C":2,"D":1,"F":0}
courseList = ["CST 161","Mat 144","ENG 201","PSY 101","HIS 101"]
gradeList = ["A","B","C","D","F"]
creditList = [3,4]

data = []
total_credit = 0
sums = 0

#input the number of course that you want to select randomly
n = int(input("Enter the number of courses : "))
for i in range(n):
    temp = []
    #for courses
    k = random.randint(0,4)
    temp.append(courseList[k])
    #for credits
    k = random.randint(0,1)
    total_credit += creditList[k]
    temp.append(creditList[k])
    #for grades
    k = random.randint(0,4)
    temp.append(gradeList[k])
    #for gradepoints
    sums += gradePoints[gradeList[k]] * temp[1]
    temp.append(gradePoints[gradeList[k]] * temp[1])

    data.append(temp)

print(tabulate(data,headers = ["Course","Credits","Grade","Value Per Course"]))
print(f"Total credits taken: {total_credit}")
print(f"Total quality points earned : {sums}")
print(f"Grade : {round(total_credit/sums,2)}")


