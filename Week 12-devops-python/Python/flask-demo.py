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