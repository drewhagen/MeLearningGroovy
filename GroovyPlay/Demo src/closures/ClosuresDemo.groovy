
//high level and simple explanation of closures:
//just a block of code.
def myClosure = { println "In a closure"}
myClosure()

//testing the deferred execution property for closures
def myClosure2 = {
    println "In a closure"
    println new Date()
}

for (i in 1..3) {
    myClosure2()
    sleep(1000)
}

//the it keyword, printing index
(1..3).each({
    println "In a closure: $it"
})

//can also arrow function with var i
(1..3).each({ i ->
    println "In a closure: $i"
})

//demonstrating how this eliminates verbose code:
(1..10).findAll({ it%2==0 }).each({
    println "In an even closure: $it"
})