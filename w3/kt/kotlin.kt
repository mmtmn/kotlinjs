fun anotherfunction(number: Int, word: String, array: Array<String>){
    println("$number number and word $word, from main into another function working!")
    for (cars in array) println("elements inside array of another function: " + cars)
}

fun myFunction(x: Int, y: Int): Int {
    return (x + y)
  }

fun shorterSintaxReturn(x: Int, y:Int) = x + y

fun main() {
    // variable creations
    var name = "t"
    val year = 2024
    // type safetying it
    val NextYear:Int = 2025
    val numberlong:Long = 2200000
    val numbershort:Short = 1
    val TrueOrFalse:Boolean = false
    val character:Char = 'A'
    val lessPrecise:Float = 10.123F
    val morePrecise:Double = 10.123456781273987123981317829 

    // outputing
    println("Hello, World!")
    println(3+3+3)
    println("Name: " + name + " Year: " + year)
    println("Next Year: " + NextYear)
    println(
        "Int: " + NextYear + "\n" + 
        "Long: " + numberlong + "\n" +
        "Short: " + numbershort + "\n" +
        "Boolean: " + TrueOrFalse + "\n" +
        "Char: " + character + "\n" +
        "Float: " + lessPrecise + "\n" +
        "Double: " + morePrecise +  "\n"
    )

    // changing types
    var IntNumber: Int = 10
    var int2float:Float = IntNumber.toFloat()
    int2float += 0.1F
    println(int2float)

    // strings manipulation
    val stringtest = "Hello World"
    val stringtestsame = "Hello World"
    val stringtestdif = "Hello World123"
    println("First character of string: " + stringtest[0])
    println("Second Character of string: " + stringtest[1])
    println("Last Character of string: " + stringtest.last())
    println("String Length: " + stringtest.length)
    println("compare strings same: " + stringtest.compareTo(stringtestsame))
    println("compare diff strings" + stringtest.compareTo(stringtestdif))
    println("finding world in the string: " + stringtest.indexOf("World"))
    println("string interpolation: $stringtest $year")

    var num1 = 0
    var num2 = 1
    var num3 = 1

    if (num1 < num2) {
        println("num1 < num0")
    }

    if (num1==num2) {
        println("error")
    } else {
        println("num1!=num2")
    }

    if (num3!=num2) {
        println("error")
        } else if (num3==num2) {
            println("num3==num2")
        }
        else {
            println("error")
        }
    
    var varifelse = if (num3!=num2) {
        "error"
        } else if (num3==num2) {
            "varifelse: num3==num2"
        }
        else {
            "error"
        }
    println(varifelse)

    val time = 100
    var greeting = if (time < 101) "Greetings" else "error"
    println(greeting)
    

    
    fun wday(day: Int) {
        var weekday = when (day) {
            1 -> "monday"
            2 -> "tuesday"
            else -> "error"
        }
        println(weekday)
    }
    wday(1)
    wday(2)

    var i = 0
    while (i < 11) {
        println(i)
        i++
    }

    var j = 0
    do {
        println(j)
        j++
    }
    while (j < 11)

    var cars = arrayOf("small", "medium", "big")
    for (x in cars) {
        println(x)
    } 
    
    for (chars in 'a' .. 'z') {println(chars)}
    for (nums in 0 .. 100) {println(nums)}

    for (nums in 0..10){
        if (nums==4){
            continue
        }
        println(nums)
    }

    if ("big" in cars) {
        println("finding with ranges working")
    }

    anotherfunction(100, "teststring", cars)
    var result = myFunction(3, 5)
    println(result)

    var shorter = shorterSintaxReturn(1,2)
    println(shorter)


}