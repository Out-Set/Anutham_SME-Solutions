
# creating a class 'Company', having three instance variables name, location and employees
class Company:
  def __init__(self, name, location, employees):
    self.name = name
    self.location = location
    self.employees = employees

business = Company("John", "India", 25)

print(business.name)
print(business.location)
print(business.employees)

