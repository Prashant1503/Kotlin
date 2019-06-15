package Basic

fun main() {

//    var list = listOf<String>("Yogi","Prashant","Ajay") //Immutable,but has fixed size...

    var mutableList = mutableListOf<String>() //Mutable,No Fixed Size,Can add or remove item..
    mutableList.add("Yogi")
    mutableList.add("Prashant")
    mutableList.add("Heet")
    mutableList.add(1,"Vani")

    mutableList.removeAt(0)


    for(element in mutableList){
        println(element)
    }



}