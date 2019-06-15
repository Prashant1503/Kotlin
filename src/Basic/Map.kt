package Basic

fun main() {

    var myMap = mapOf<Int,String>(
        2 to "Yogi", 43 to "Manmohan" ,7 to "Prashant")   //Immutable,READ ONLY,Fixed Size


    for (key in myMap.keys){
        println("Element present at key :$key = ${myMap.get(key)}")
    }






}