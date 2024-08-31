fun main() {
    println("=================================================")

    // muttable variable (variabel yang bisa di isikan nilai kembali)
    var name: String = "bayu";
    name = "firmansyah";

    // template literal
    println("Nama saya adalah ${name}");


    // immutable variable (variabel yang tidak bisa di isikan nilai kembali)
    val phi: Double = 3.14;

    // templare literal
    println("Nilai dari phi adalah ${phi}")
    println("=================================================")

    // type data range (di tandai dengan doubel colon atau ..)
    var range = 1..10
    println(range);

    // looping range
    for(num in range){
        print("${num},");
    }

    // add new line
    println();

    // first value from range
    println("first value in range ${range.first()}")

    // last value from range
    println("last value in range ${range.last()}")

    // contains value from range
    println("is exist value 20 in range 1..10 is ${range.contains(20)}")

    // step value from range
    println("step value in range ${range.step(5)}")

    println("=================================================")
}