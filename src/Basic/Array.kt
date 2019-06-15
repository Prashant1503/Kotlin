package Basic

fun main() {

    var myAray = Array<Int>(5) {0}  //Mutable in nature,but has fixed size...
    myAray[0]= 2
    myAray[3] = 5
    myAray[2] = 4


    for(element in myAray){
        println(element)
    }
}