# We can create a tuple that keeps track of the x,y coordinates of a point
# Tuples values are separated by commas
point = 10,20

# Print out individual values in the tuple
print(point[0])  # x value 
print(point[1])  # y value

# Can't append to a tuple after it is created. Tuples are immutable
# point.append(30) # This will cause an error

# Change the values, tuples do not support directly changing values but we can re-assing the entire tuple like this:
point = point[0] + 5, point[1] + 10

# Print out the modified tuple
print(point)

# Extract out the individual fields from the tuple into separate variables
x, y = point
print("x ;{}, y :{}".format(x, y))

# We can also create a tuple with the tuple() function
point2 = tuple((30, 40))
print(point2)
print(type(point2)) # should print <class 'tuple'>

# We can create a tuple with a single value, but we need to include a trailing comma
single_value_tuple = (10,)
print(type(single_value_tuple)) # should print <class 'tuple'>
not_a_tuple = (10) # this is just an int
print(type(not_a_tuple)) # should print <class 'int'>

# We can also create a tuple without using parentheses
another_tuple = 1, 2, 3, 4, 5
print(another_tuple)    # should print (1, 2, 3, 4, 5)

# We can convert other iterables (like lists) into tuples with the tuple() function
my_list = [100, 200, 300]
my_tuple = tuple(my_list)
print(my_tuple) # should print (100, 200, 300)



