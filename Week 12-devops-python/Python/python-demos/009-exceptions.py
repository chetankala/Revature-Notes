class MyCustomException(Exception):
    # The pass statement is simply here for lack of a proper class body.
    pass

# Valid 
try:
    # This line of code stops the execution of the script.
    raise MyCustomException()

except MyCustomException:
    # Taking the appropiate corrective action
    print("Got away safely!")

# This line of code now runs.
print("Now back to our regularly scheduled program!")

