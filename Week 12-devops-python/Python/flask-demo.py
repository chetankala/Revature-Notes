# From the flask package, import the Flask class
from flask import Flask, request, jsonify

# Using the Flask constructor, create a flask app instance
# Current module name as argument:
print(__name__)
app = Flask(__name__)

# Set up path for Hello World, just the default path to the web app:
@app.route('/')

# Set up routes:
def hello_world():
    return 'Hello, World!'

# Returning JSON response:
@app.route('/constants', methods=['GET'])
def get_constants():
    constants = {
        "pi": 3.14159,
        "e": 2.71828,
        "golden_ratio": 1.61803
    }
    # jsonify the request so it can be sent over HTTP
    return jsonify(constants)

# Setting up our "main" function:
if __name__ == '__main__':
    # Run the app
    app.run()