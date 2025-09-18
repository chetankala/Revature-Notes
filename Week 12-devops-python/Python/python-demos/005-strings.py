# Multiple ways to create strings
single_quote = 'single-quote or APOSTROPHE'
double_quote = "double-quote"
triple_quote = """
This is a multi-line string.
1. Line 1
2. Line 2
3. Line 3
"""

print(single_quote)
print(double_quote)
print(triple_quote)

print(single_quote.upper())  # Convert to uppercase
print(single_quote.lower())  # Convert to lowercase
print(single_quote.replace("single", "SINGLE"))  # Replace substring
print(single_quote.find("quote"))  # Find substring, returns index or -1 if not found

print(len(double_quote))  # Length of the string   
print(double_quote.split())  # Split string into a list of words
print(double_quote[0])  # Access character by index


# For more string methods, see: https://docs.python.org/3/library/stdtypes.html#string-methods or https://www.w3schools.com/python/python_strings.asp