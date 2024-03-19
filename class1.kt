class class1 {
    fun Input():Int{
        println("Введите сколько заправок хотите сделать")
        val n= readLine()!!.toInt()
        if(n>0)
        {
            return n
        }
        else{
            println("Количество заправок должно быть больше 0")
            return 1
        }
    }
fun Zapravka():Double {
    println("Цена за один литр 90 рублей")
    var a = 90
    println("Введите сколько литров хотите заправить")
    val b = readLine()!!.toDouble()
    val price = b * a
    println("Вы заправились на $price руб")
    if (b > 0) {
        return b
    } else {
        println("Количество литров не может быть меньше 0")

    };return TODO("Provide the return value")
}}
