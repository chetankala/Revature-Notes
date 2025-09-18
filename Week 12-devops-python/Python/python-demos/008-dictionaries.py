capitals = dict() # Create an empty dictionary

capitals['New York'] = 'Albany'
capitals['California'] = 'Sacramento'
capitals['France'] = 'Paris'
capitals['Italy'] = 'Rome'
capitals['USA'] = 'Washington DC'

# Print the entire dictionary
print(capitals)
# Print just the keys
print(capitals.keys())  
# Print just the values
print(capitals.values())
# Print the number of items in the dictionary
print(len(capitals))
# retrieve a specific value by key
print(capitals['Italy'])

# Iterate through the keys in the dictionary
for state in capitals:
    print("The capital of {} is {}".format(state, capitals[state])) 

# Another way to iterate through the keys in the dictionary
for state in capitals.keys():
    print("The capital of {} is {}".format(state, capitals[state]))

# Iterate through the values in the dictionary
for city in capitals.values():
    print("Capital city: {}".format(city))

# Iterate through both keys and values in the dictionary
for state, city in capitals.items():
    print("The capital of {} is {}".format(state, city))

