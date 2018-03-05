def cat = "meow"
def one = 1

println cat
println cat.getClass() //to demonstrate how
//specific types are assigned at runtime.

println one
println one.getClass()
//assigned a static type at runtime inferred
//by the variable's value.

//demonstrating Groovy casting error:
// Integer two = "two"
/* CLI OUTPUT:
Caught: org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'two' with class 'java.lang.String' to class 'java.lang.Integer'
org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'two' with class 'java.lang.String' to class 'java.lang.Integer'
	at DynamicDemo.run(DynamicDemo.groovy:14)
* */

//demonstrating Groovy missing method error:
//What happens if we tried calling Java type specific operations?
//println one.toUpperCase()
/* CLI OUTPUT:
Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.Integer.toUpperCase() is applicable for argument types: () values: []
groovy.lang.MissingMethodException: No signature of method: java.lang.Integer.toUpperCase() is applicable for argument types: () values: []
	at DynamicDemo.run(DynamicDemo.groovy:23)
* */


//Groovy doesn't enforce type-checking at compile time... rather, at run time
//you can test this by trying to compile the code with these errors above using 'groovyc' command
//you'll notice that compilation work.
def three = 3
println three
println three.getClass()
println three = "three"
println three.getClass()

//DUCK TYPING:
//if it talks like a duck and walks like a duck, it must be a duck
//frees us to make assumptions about the typing but not enforce it

//IMPORTANT:
//when using duck-typing languages on a big team, it's VERY IMPORTANT to have
//very solid Unit Testing procedures, as a safety-net for the potential bugs,
//since there isn't compile-time exception handling on these types.