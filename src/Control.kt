fun main(){
    var nilai: Int = 80;
    var language: String = "jepang";

    if(nilai >= 91 && nilai <= 100){
        println("selamat anda mendapatkan nilai A")
    }else if(nilai >= 81 && nilai <= 90){
        println("selamat anda mendapatkan nilai B")
    }else{
        println("mohon maaf anda harus mengulang matkul ini")
    }


    when{
        language == "indonesia" -> {
            println("Selamat pagi bayu")
        }
        language == "english" -> {
            println("Good morning bayu")
        }
        language == "german" -> {
            println("Gutten morgen bayu")
        }
        else -> {
            print("Maaf, ucapan pada bahasa ${language} tidak tersedia")
        }
    }
}