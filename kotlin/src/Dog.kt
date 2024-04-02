abstract class Dog(override var poroda: String,
                   override var rostHolka: Double,
                   override var okras: String,
                   override var ves: Double,
                   override var behavior: String,
                   var love: Double
                   ): IDog{
                       override fun Input(){
                           try{
                               println("ВВедите породу собакена(буквами)")
                               poroda = readLine().toString()
                               println("Введите рост в холке(в метрах, через точку)")
                               rostHolka = readLine()!!.toDouble()
                               println("ВВедите окрас собаки(монохром,двуцвет и т.д)")
                               okras = readLine().toString()
                               println("Введите вес(в киограммах, через точку)")
                               ves = readLine()!!.toDouble()
                           }catch (e:Exception){
                               println("Вы ввели неверное значение, так что там все 0.0")
                           }
                       }
    override fun Output(){
        try{
            println(
                "Порода собаки:$poroda,\nрост собаки:$rostHolka m,\n" +
                        "вес собаки:$ves kg\nокрас собаки:$okras,\nхарактер собаки:$behavior"
            )
        }catch (e:Exception){
            println("технические шоколадки")
        }
    }
    abstract fun NNN()
}