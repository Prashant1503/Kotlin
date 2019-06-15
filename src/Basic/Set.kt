package Basic

fun main() {

    //"Set" contains unique element...
//    "Hash Set" also contains elements but Sequence doesn't gurantee..

    var mySet = setOf<Int>(2,54,34,65,100,200,4,33,21,2,3,5,6,8,7)  //Imutable,READ Only...

    var mySet1 = mutableSetOf<Int>(2,3,4,5,6,7,8,9,0) //Mutable Read and Write both...

    var myHashSet = hashSetOf<Int>(4,3,2,1,0,9,8,7) //Sequence doesn't matters...
    myHashSet.add(22)
    mySet1.remove(2)



    for(set in myHashSet){
        println(set)
    }

}