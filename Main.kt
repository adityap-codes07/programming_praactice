fun main() {
    println("Welcome to Kotlin!")

    val name: String = "Aditya"
    val age: Int = 20

    println("Name: $name")
    println("Age: $age")

    if (age >= 18) {
        println("$name is an Adult ")
    } else {
        println("$name is a Minor ")
    }

    println("\nCounting from 1 to 5:")
    for (i in 1..5) {
        println(i)
    }

    fun greet(user: String): String {
        return "Hello, $user! 👋"
    }

    println("\n" + greet(name))
}
