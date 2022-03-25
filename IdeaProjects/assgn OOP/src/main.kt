fun main(){
    var person =Human("Asia",23,45)
    person.eat( 5)
    println(person.weight)
    person.speak( "i am not full")
    person.age

    var User=data( "finn", "amina", "fin@gmail", 12345678, 7755)
    println(User.email)
    println(User.lastName)

}
class Human(var name:String, var age : Int, var weight: Int) {
    fun eat(foodWeight: Int) {
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
    }

fun speak(speech: String): String {
    return speech


}
fun birthday() {
    age++
  }

}
class data(var firstName:String,var lastName:String, var email:String ,var phoneNumber:Int ,var password:Int)


