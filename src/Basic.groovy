/**
 * Created by strongant on 17-4-11.
 */
//input :[0,1,2,3,4,5,6,7,8,9]
//output:[0,1,4,9,16,25,36,49,64,81]
( 0..<10 ).stream().map {
    i -> i**2
}.forEach {
    println it
}


