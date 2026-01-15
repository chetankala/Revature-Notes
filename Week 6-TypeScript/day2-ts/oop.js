function calculateArea(x, y){
    if (y == undefined){
        return Math.PI * x * x; // Area of circle
    }
    else {
        return x * y; // Area of rectangle
    }
}

console.log(calculateArea(5)); // Circle with radius 5
console.log(calculateArea(4, 6)); // Rectangle with width 4 and height 6