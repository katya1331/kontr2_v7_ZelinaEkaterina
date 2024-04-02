import Pet.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.*
suspend fun main()=runBlocking{
    try{
        println("Сколько раз повторяем?")
        var n = readLine()!!.toInt()
        if (n>0)
        {
            while (n>0)
            {
                println("осталось: $n")
                var pt = Pet("",0.0,"",0.0,"",0.0)
                try{
                    launch{
                        pt.Input()
                        pt.Behavior()
                        pt.Output()
                        pt.NNN()
                    }

                }catch (e:Exception){
                    println("технические шоколадки")
                }
                delay(10000)
                println("\n Хотите funfuct?... \n нет? \n А будет! ")
                pt.Facts()
                n--
            }
            println("ну все, понаписывали тут собак")
        }else println("Ну хоть раз! я же старалась тут :(")
    }catch (e:Exception){
        println("технические шоколадки")
    }

}