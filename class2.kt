import kotlinx.coroutines.delay

class class2(var login:String, var passw:String, var reposw:Int, var Open:Boolean) {
suspend fun sort(rep: List<class2>): List<class2>{
    delay(2000L)
    return rep.filter {it.Open}.sortedWith(compareBy{it.reposw})
}
    suspend fun info():String{
        delay(1000L)
        return "Логин: $login, пароль: $passw, Количество репозиториев: $reposw"
    }
}