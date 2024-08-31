fun biodata(name: String, age: Int, isMale: Boolean): Unit{
    println("Nama saya adalah ${name}")
    println("Saya sekarang berumur ${age}")
    println("Dan saya ${ if(isMale) "seorang" else "bukan seorang" } laki-laki")
}

fun main()
{
    biodata(
        isMale = true,
        name = "Bayu Firmansyah",
        age = 21
    )
}


