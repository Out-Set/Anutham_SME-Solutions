# even_list including 100, till 100
even_list = []
for i in range(1, 101):
    if i%2 == 0:
        even_list.append(i)

print("even_list: ")
print(even_list, "\n")


# even_list_len
even_list_len = len(even_list)

print("even_list_len: ")
print(even_list_len, "\n")


#last 5 elements of even_list
last_five_even_elements = even_list[-5 : ]
print("last 5 elements of even_list: ")
print(last_five_even_elements, "\n")


# second_to_last_even_element
second_to_last_even_element = even_list[1 : len(even_list)]
print("second_to_last_even_element: ")
print(second_to_last_even_element, "\n")


# first_ten_even_elements
first_ten_even_elements = even_list[0 : 10]
print("first_ten_even_elements: ")
print(first_ten_even_elements)

