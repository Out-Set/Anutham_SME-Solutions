class Worker:
    employee_number = 0
    office_number = 0
    name = "First Last"
    birthday = ""
    hours_worked = 0
    overtime_hours_worked = 0
    sales = 0


    def add_hours(self, hours):
        # throws the exception if the hours < 0
        if hours < 0:
            raise Exception("hours should not be less than 0")
        self.hours_worked += hours

    def get_hours_worked(self):
        return self.hours_worked

    def add_sales(self, sales):
        # throws the exception if the sales < 0
        if sales < 0:
            raise Exception("sales should not be less than 0")
        self.sales += sales

    def get_sales(self):
        return self.sales

    def set_employee_number(self, employee_number):
        # throws the exception if the employee_number is not int
        if not isinstance(employee_number, int):
            raise Exception("employee_number should be integer type only")
        self.employee_number = employee_number

    def get_employee_number(self):
        return self.employee_number

    def set_office_number(self, office_number):
        # throws the exception if the office_number is < 100 and > 500
        if office_number < 100 or office_number > 500:
            raise Exception("Invalid office number")
        else:
            self.office_number = office_number

    def get_office_number(self):
        return self.office_number

    def set_name(self, name):
        # throws the exception if the name is empty
        if len(name) == 0:
            raise Exception("Name should not be empty")
        name = ''.join([i for i in name if i not in '_.-'])
        self.name = name

    def get_name(self):
        return self.name

    def set_birthday(self, birthday):
        # throws the exception if the birthday is not valid
        list_b = list(map(int, birthday.split()))
        if not list_b[0] in range(1, 32):
            raise Exception("day is not in the range (1,31)")
        elif not list_b[1] in range(1, 13):
            raise Exception("month is not in the range (1,12)")
        else:
            self.birthday = birthday


if __name__ == '__main__':
    # valid test cases
    worker = Worker()
    worker.add_hours(10)
    worker.add_sales(10)
    worker.set_employee_number(101)
    worker.set_office_number(200)
    worker.set_name("Hello_and.-")
    worker.set_birthday("1 2")
    print("hours_worked:", worker.hours_worked)
    print("sales:", worker.sales)
    print("employee_number:", worker.employee_number)
    print("office_number:", worker.office_number)
    print("name:", worker.name)
    print("birthday:", worker.birthday)

    # invalid test cases with exception handling 
    try:
        worker.add_hours(-1)
    except Exception:
        print("Exception for add hours -1")

    try:
        worker.add_sales(-1)
    except Exception:
        print("Exception for add sales -1")

    try:
        worker.set_employee_number("hello")
    except Exception:
        print("Exception set employee number")

    try:
        worker.set_office_number(20)
    except Exception:
        print("Exception for set office number")

    try:
        worker.set_name("")
    except Exception:
        print("Exception for set name")

    try:
        worker.set_birthday("32 2")
    except Exception:
        print("Exception for day 32")

    try:
        worker.set_birthday("2 0")
    except Exception:
        print("Exception for month 0")


