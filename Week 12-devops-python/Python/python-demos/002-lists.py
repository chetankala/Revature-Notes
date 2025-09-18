# Create a list with square-brackets:
L = []

# We can use the .append method to add items to the list:
L.append(0)
L.append(1)
L.append(2)
L.append(3)
# We can have different data types in the same list:
L.append("Dog")
L.append(True)
L.append("cat")

print(L) # Will print the whole list ([0, 1, 2, 3, 'Dog', True, 'cat'])

# Like most other languages, arrays/lists are zero-indexed:
print(L[0]) 
# We can uses negative indexes to count from the end of the list:
print(L[-1]) 
print(L[-2]) 

# Use indexes to retrieve a sub-set of the list:
# Start with index 2 (inclusive), end with index 5 (exclusive)
print(L[2:5])
# just enter the lower bound and it will return everything starting from that index
print(L[2:])
# Just enter the upper bound and it will return everything up to (but not including) that index
print(L[:5])

# "pop" items off of the end:
# pop function returns the last item in the list and removes it from the list
print(L.pop())
# remove item at index 0
L.remove(0)
print(L)