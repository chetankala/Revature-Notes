L = [1,2,3,4,5,6,7,8,9,10]

print(L)

s = set()  # Create a set 

# Add an item to the set
s.add(1) 
s.add(2)
s.add(3)
s.add(4)
s.add(5)
s.add(6)
s.add(7)
s.add(8)
s.add(9)
s.add(10)
# because sets only store unique items, adding a duplicate item has no effect
s.add(10)
s.add("fish")
s.add("apple")
s.add("pizza")
s.add("tuna")

print(s)