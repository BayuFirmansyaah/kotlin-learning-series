// vararg adalah sebuah type data pada argumen yang dapat menerima banyak value
// jika pada javascript ini seperti spread operator

fun sumTotalArray(vararg values: Int): Int{
    var total = 0;

    for(value in values){
        total += value;
    }

    return total
}

fun main(){
    println("total seluruh nilai adalah ${sumTotalArray(1,2,3,4,5,6,7,8,9,10)}")
}