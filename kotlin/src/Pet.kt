class Pet(poroda:String, rostHolka: Double,okras: String,ves: Double,behavior: String,love:Double):Dog(poroda,rostHolka,okras,ves, behavior,love) {
    fun Facts(){
        try{
            println("Выберите породу песеля: \n1.Пудель \n2.Лабрадор \n3.Доматинец \n4.Питбуль")
            var otvet = readLine()!!.toInt()
            if (otvet == 1){println("Пудели считаются вторыми по интеллекту собаками в мире.")}
            else if (otvet == 2){println("Тянут в рот почти все, что видят, следите за тем, что ест Ваш песик.")}
            else if (otvet == 3){println("Далматины рождаются чисто-белого цвета, без единого пятнышка. Пятна у собак появляются только по мере взросления.")}
            else if (otvet == 4){println("Пит-бультерьеры отлично ладят с детьми. Их бы не называли «собаки-няни», если бы это было не правдой")}
            else println("Вы не ввели номер песика :(")
        }catch (e:Exception){
            println("технические шоколадки")
        }
    }
    fun Behavior(){
        try{
            println("Введите характер собаки(добрая, агрессивная, ленивая и т.д)")
            behavior = readLine().toString()
        }catch (e:Exception){
            println("технические шоколадки")
        }
    }

    override fun NNN() {
        try{
            love = rostHolka * ves;
            println("Вот скоько любви у вас есть: $love m^2")
        }catch (e:Exception){
            println("технические шоколадки")
        }
    }
}