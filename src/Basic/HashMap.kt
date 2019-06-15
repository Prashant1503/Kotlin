package Basic

fun main() {

    var myMap = HashMap<Int,String>() //Mutable,READ and WRITE,No Fixed Size..

    myMap.put(4,"Prashabt")
    myMap.put(5,"Ajay")
    myMap.put(6,"Dinesh")
    myMap.replace(5,"Pr")

    for (key in myMap.keys){
        println("Element present at this $key is ${myMap[key]}")
    }
}