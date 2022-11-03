class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def get_data(self):
        return self.data

    def get_next(self):
        return self.next

    def set_data(self, new_data):
        self.data = new_data

    def set_next(self, new_next):
        self.next = new_next


def get_predecessor(obj, st):
    while(obj.next != None):
        if(obj.next.data == st):
            return obj.data
        obj = obj.next
    return None


x = Node('hello')
y = Node('world')
z = Node('goodbye')
x.set_next(y)
y.set_next(z)
print(get_predecessor(x, 'goodbye'))


x = Node('hello')
y = Node('world')
z = Node('goodbye')
x.set_next(y)
y.set_next(z)
print(get_predecessor(x, 'hello'))
