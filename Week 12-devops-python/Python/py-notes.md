## Python
- Python is a programming language that is interpreted rather than compiled
    - With Java, we had to compile our code using javac command
    - And then, we would run our compiled code
- Python is "interpreted" line by line rather than compiled all at once
- Syntax - When set up blocks of code (such as if-statements, for-loops, etc.), we use colons and indentations as opposed to curly braces
- Variable Types - when we declare variables in python, we don't explicitly state the data types, and we can change/re-assign to a new variable type after instantiation
- Make sure to include .py extension on all Python files

### Running a Python Script:
- Make sure we have Python installed on your device (Workspace one if you have a work computer)
- To test this installation out, run python from our command line
    - If installed correctly, you should see the Python version and an interactive prompt to enter Python code
        - CTRL+Z - to exit this interactive prompt

### Lists
- Can take any data type, have different data types within the same list
- Use negative indexes to retrieve the last elements of a list
    - -1 - returns the last item
    - -2 - returns the second-to-last item
- Colons to return subnets
    - ```L[b:e]```
        - b - beginning index (inclusive)
        - e - ending index (exclusive)

### Input
- Let us retrieve input from the user:
```python
x = input("Enter your value => ")
```

### Ranges
- Ranges can be used to produce a range of values
    - Could use to iterate through a list
        - IF we use the elements from the range as the index to our list
    - Takes in 3 arguments
        - Lower Bound (inclusive)
        - Upper Bound (exclusive)
        - Step - the amount by which we "step" from one element to the next

### Strings
- Strings can be declared using single-quotes, double-quotes, or triple-quotes
- Python offers many String functions that are similar to what Java offers
    - Check out some of the functions [here](https://www.w3schools.com/python/python_strings.asp)

### Data Structures
- Lists
    - Lists, index-based
    - can contain different data types
    - Can contain duplicates
    - Insertion Order maintained
- Sets
    - Like in Java, sets cannot have duplicate values, will only contain unique values
    - Insertion Order - not necessarily maintained
    - Can contain different data types
- Tuples
    - Like lists, but cannot be appended to
    - Can have different data types
    - Values are seperated by commas
    - Ordered
    - Unchangable - we can't modify the structure of the tuple
        - We can't directly change the fields, but we can just re-assign a new tuple
    - Allows duplicates
- Dictionaries
    - Similar to Map in Java
    - Key-Value Pairs
    - Keys can't repeat, but the values can

# Python
## Classes
- Like in Java and other languages, classes can serve as a blueprint from which to create/instantiate objects
- Python classes can have fields and methods

## Dunder Methods
- Dunder/Magic methods are special methods that are invoked in certain situations
    - __init__ - invoked when the object is created/instantiated, like a constructor
    - __str__ - invoked when printing the object, converts the object to a string
    - __add__ - defining behavior for + operator
    - __sub__ - defining behavior for - operator
- See [here](https://www.geeksforgeeks.org/python/dunder-magic-methods-python/) for a more exhaustive list of dunder methods

## Flask
- Flask is a library that lets us build web applications with Python

### Installations
- Flask is a dependency, which means we have to instal it before we can use it
- pip is the Python package manager
    - pip install flask
        - If we try running this without special set-up, it will time out
- Set-Up:
    - First, we need to create a pip directory in our Roaming folder
        - On Windows: md %APPDATA%\pip & explorer %APPDATA%\pip
    - Then, download pip.ini file and place it in that folder
        - If you are warned about this download, just click the 3 dots and select "keep" to keep the file

## Sample App
```python
# From the flask package, import "Flask" class,
from flask import Flask, request, jsonify

# Using the Flask constructor to create a flask app
# current module name as the argument:
print(__name__)
app = Flask(__name__)

# Set up path for Hello World, just the default path to the web app:
@app.route('/')
# Set up routes:
def hello_world():
    return "Hello World"

# Returning some data:
@app.route('/constants', methods = ['GET'])
def get_constants():
    # Check the type of the request:
    if request.method == 'GET':
        # jsonify the request so it can be sent over HTTP:
        return jsonify({'pi': 3.14159265359, 'e': 2.71828}) 


# Setting up our "main":
if __name__ == '__main__':
    # Running the app:
    app.run()
```

## How to consume external APIs from Spring app?
- RestTemplate - offered by Spring web, lets us pass in an endpoint and returns an HTTPResponse object
### Example Usage:
```java
@GetMapping("/area")
    public double getArea(@RequestParam("radius") int radius) {
        // Area = pi * r ^ 2
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MathConstantsDTO> response = restTemplate.getForEntity("http://127.0.0.1:5000/constants", MathConstantsDTO.class);
        // restTemplate.
        double pi = response.getBody().getPi();
        double area = pi * Math.pow(radius, 2);
        return area;
    }
```

