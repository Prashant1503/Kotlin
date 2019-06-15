package Basic

fun main() {

////    Break keyword...
//
//  for(i in 1..10) {
//
//      println(i)
//
//      if(i ==5)
//          break
//      println("Value is found")
//
//  }
////    End of break Keyword..


    for(i in 1..10){
        for(j in 1..10){

            if(i %j ==0){
                println("Even")

            }
            else
            {
                println("Odd")

            }
        }
    }
}