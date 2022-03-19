fun main(args: Array<String>) {
    println()
    print("Enter the number : ")
    var num = readLine()!!.toInt()
    println("Multiplication Table : ")
    var i=1
    while (i<=10){
        val prod = num * i
        println("$num x $i = $prod")
        i++
    }
}

