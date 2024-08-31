// return UNIT digunakan untuk function yang tidak melakukan return value
fun biodata(name: String, age: Int, isMale: Boolean): Unit{
    println("Nama saya adalah ${name}")
    println("Saya sekarang berumur ${age}")
    println("Dan saya ${ if(isMale) "seorang" else "bukan seorang" } laki-laki")
}

fun sum(first: Int, second: Int): Int{
    return first+second
}

fun main()
{
    biodata(
        isMale = true,
        name = "Bayu Firmansyah",
        age = 21
    )

    println("Hasil penjumlahan dari 2 dan 3 = ${sum(2, 3)}")
}


