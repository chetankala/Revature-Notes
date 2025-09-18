def print_name(name):
    # can set up placeholders with {} in our print statement and then "inject" values into those placeholders with .format()
    # the string using the .format() method:
    print("Hello, {}!".format(name))

def print_names(name1, name2):
    print("Hello, {} and {}!".format(name1, name2))

# Function that takes an age, and an optional "incr" argument
# and increments the age by that amount (default is 1)
def increment_age(age, incr=1):
    age += incr
    return age # return the new age

print_name("Alice")
print_names("Alice", "Bob")

# By default, if we print out items, sperated by commas, it will put a space between each item and a newline at the end
print("pizza", "wings", "bread")

# We can manually configure what is printed between items with the "sep" argument
print("pizza", "wings", "bread", sep="...", end="\n\n")
print("something else")

age = 40
age = increment_age(age, 10)
print(age) # should print 50
age = increment_age(age) # should increment by 1
print(age) # should print 51

