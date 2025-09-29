# Note that booleans start with a capital letter
# raining = input("Is it raining? (y/n) => ")
# raining = raining == "y"
# temperature = int(input("What is the temperature outside? => "))
raining = True
temperature = 45

# If statement
if raining and temperature >= 45:
    print("need an umbrella")
elif raining and temperature < 45:
    print("need a coat and an umbrella")
elif not raining and temperature < 45:
    print("need a coat")
else:
    print("no coat or umbrella needed")

secret_number = 74
while True:
    #guess = int(input("Guess the secret number between 1 and 100 => "))
    guess = secret_number  # For testing purposes, we set guess to the secret number
    if guess < secret_number:
        print("Too low")
    elif guess > secret_number:
        print("Too high")
    else:
        print("You got it!")
        break

L = ["apple", "banana", "cherry", "orange"]
# Ranges, store a sequence of numbers to iterate over:
# Range from 0 up to the length of the list (exclusively)
r1 = range(0, len(L))
# If we don't explicity provide a start, it starts at 0 by default
r2 = range(len(L))
# Set up a range from 0 to 100 but stepping by 10
r3 = range(0, 100, 10)

for i in r1:
    print(i)

for i in r2:
    print(i)

for i in r3:
    print(i)

# Iterate through list:
for i in r2:
    print(L[i])

# Another way to iterate through a list
for item in L:
    print(item) 
# Iterate through a list and get the index of each item
for index, item in enumerate(L):
    print("index: {}, item: {}".format(index, item))
# Iterate through a string
for char in "Hello":
    print(char)

    