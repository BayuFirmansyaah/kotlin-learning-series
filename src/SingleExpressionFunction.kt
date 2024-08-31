fun sumInline(first: Int, second: Int): Int = (first + second)

fun sayHello(name: String): Unit = println("haii ${name}")

fun main(){
    println("hasil dari 2 ditambah 4 adalah ${sumInline(2, 4)}")
    sayHello("ubayyy")
}