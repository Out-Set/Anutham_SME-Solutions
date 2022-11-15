def is_sorted(list):
    for i in range(0, len(list)-1):
        if list[i+1] >= list[i]:
            return True
        
        return False
        
numbers = [1, 2, 5, 6, 8]

print(is_sorted(numbers))