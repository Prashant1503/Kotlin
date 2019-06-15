package Basic

fun main() {

    val x=1

//    When Statement....

    var Str:String = when (x) {  //Same as Switch-Case Statement...
        1-> "x is 1"
        2 -> "x is 2"

        else -> {

            "x is not defined"

        }
    }
    println(Str)

}