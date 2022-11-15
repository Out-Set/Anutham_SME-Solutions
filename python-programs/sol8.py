# Binary trees

class Node: 
    # Constructor to create a new node 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
      

def equal(self, other): 
      
    # In case Both trees are empty 
    if self is None and self is None: 
        return True 
  
    # In case Both trees are non-empty -> Compare them 
    if self is not None and other is not None: 
        return ((self.data == other.data) and 
                equal(self.left, other.left)and
                equal(self.right, other.right)) 
      
    # In case one empty, one not -- false 
    return False

 
def count(root, num): 
    count = 0
    if root is None: 
        return
      
    # Create an empty queue for level order traversal 
    queue = [] 
  
    # Enqueue Root and initialize height 
    queue.append(root) 
  
    while(len(queue) > 0): 
        # Print front of queue and remove it from queue 
        if queue[0].data == num:
            count +=1
        # print queue[0].data, 
        node = queue.pop(0) 
  
        #Enqueue left child 
        if node.left is not None: 
            queue.append(node.left) 
  
        # Enqueue right child 
        if node.right is not None: 
            queue.append(node.right)    
    
    return count
    
# program to test equal function and count function
root1 = Node(1) 
root2 = Node(1) 
root1.left = Node(2) 
root1.right = Node(3) 
root1.left.left = Node(1) 
root1.left.right = Node(1) 
  
root2.left = Node(2) 
root2.right = Node(3) 
root2.left.left = Node(4) 
root2.left.right = Node(5) 

num = 1
 
if equal(root1, root2): 
    print("Both trees are identical")
else: 
    print("Trees are not identical")
    
    print("Number of times given number appears")
    print(count(root1,num))

    