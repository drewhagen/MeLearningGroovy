def beatles = ["John","Paul","George","Ringo"]

for (def i =0; i<beatles.size; i++) {
    def greeting = "Hello, "

    //println "$greeting" + "$beatles[i]"
    //won't work! We have to upgrade precedence for the $ sign,
    //or it will print the entire array.

    println "$greeting" + "${beatles[i]}" //we can do this with curly brackets.

    //We can put a lot of other things into curly brackets with a $, too. Interpolation
    println "${i*10}"

    //println '${i*10}'
    //single quotes don't work for this!
}

//way simpler way to write this in Groovy
for (beatle in beatles) {
    def greeting = "Hello, "
    println "$greeting $beatle"
}



