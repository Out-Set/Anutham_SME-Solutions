# Giving the following code
class Rectangle:
    def __init__(self, l, w):
        self.length = l
        self.width = w

    def rectangle_area(self):
        return self.length*self.width

    def rectangle_perimeter(self):
        return (self.length+self.width)*2

# R1 object of rectangle type is created
R1 = Rectangle(20, 12)
print(R1.rectangle_area())
print(R1.rectangle_perimeter())


# R2 object of rectangle type is created
R2 = Rectangle(200, 112)
print(R2.rectangle_area())

