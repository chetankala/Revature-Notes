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

# Extract oout the individual fields from the tuple into separate variables
x, y = point
print("x ;{}, y :{}".format(x, y))

# We can also create a tuple with the tuple() function
point2 = tuple((30, 40))
print(point2)

