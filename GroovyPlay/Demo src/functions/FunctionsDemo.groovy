def numbers = 0..9
for (num in numbers) {
    if (isEven(num)) {
        println num
    }
}

def isEven(num) {
    num%2 == 0
}
//note: remember that Groovy returns the last line executed in the function
//so the 'returns' keyword is not necessary.
