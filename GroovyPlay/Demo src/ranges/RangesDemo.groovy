//loop to generate a collection of numbers can be replaced with ...

def numbers = 1..10
for (num in numbers) {
    println num
}

//ranges don't have to just be numbers
def range = 'a'..'g'
for (var in range) {
    println var
}

//ranges work on enums
def enum DAYS {
    SUN,
    MON,
    TUES,
    WED,
    THUR,
    FRI,
    SAT
}

def weekdays = DAYS.MON..DAYS.FRI
for (day in weekdays) {
    println day
}

//ranges have a property known as 'extents'
println "Extents: "
println weekdays.from
println weekdays.to