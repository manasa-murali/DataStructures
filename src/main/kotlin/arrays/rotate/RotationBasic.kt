package arrays.rotate

/**
 1> TEMP ARRAY
 2> ROTATE BY ONE N TIMES,WITH ONE TEMP SPACE
 3> JUGGLING ALGORITHM, GCD
 4> REVERSI - THIS ONE
 for left rotattion, take 0 to k-1
 for right rotation take, array size-k to array size
*/
fun main(){
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val rotateBy = 2
    array.reverse(0,rotateBy)
    array.reverse(rotateBy,array.size)
    array.reverse()
    println(array.contentToString())
}
