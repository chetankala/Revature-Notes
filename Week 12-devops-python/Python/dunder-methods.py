class Teenager:
    _moody = True;
    
    def __init__(self, age, height):
        self.age = age;
        self.height = height;

    def __gt__(self, other):
        if self.age > other.age:
            return True;
        else:
            return False;

teen_one = Teenager(13, 65);
teen_two = Teenager(15, 70);

# This raises a TypeError without the __gt__ method defined
if teen_one > teen_two:
    print("Teen one is older than teen two")
else:
    print("Teen two is older than teen one")
