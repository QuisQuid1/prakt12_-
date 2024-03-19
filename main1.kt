import kotlinx.coroutines.*
 fun main()= runBlocking{
     var repos= mutableListOf<class2>()
     var pass=""
     var reposw=0
     var Loc=0
     while (true){
         try {
             println("Введите нового участника, введите exit для выхода")
             val log= readLine()!!.toString()
             if (log=="exit"||log=="Exit"||log=="EXIT")break
             println("Введите пароль не менее 8 символов")
             pass= readLine()!!.toString()
             if(pass.length>=8)
             {
                 println("Введите количество репозиториев")
                 reposw= readLine()!!.toInt()
                 if(reposw>0)
                 {
                     println("Каким вы хотите сделать свой репозиторий? 1-открытый, 2-закрытый")
                     Loc= readLine()!!.toInt()
                     if(Loc!=1&&Loc!=2)
                     {
                         println("Вы выбрали не допустимый вариант")
                     }
                     val loc:Boolean=Loc==1
                     var rep = class2(log, pass, reposw,loc )
                     repos.add(rep)
                 }
                 else{
                     println("количество репозиториев не может быть меньше 0")
                 }
             }
             else{
                 println("пароль не может быть меньше 8 символов")
             }
         }
         catch (e:Exception){
             println("Вы ввели что то не то")
         }
     }
     println("Загрузка")
     delay(3000)
     val sort=repos.first().sort(repos)
     sort.forEach{
         println(it.info())
     }
 }
