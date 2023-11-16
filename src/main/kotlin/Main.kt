fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()
    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    if (num1 != num2 && (num1 % 2 != 0 || num2 % 2 != 0)) {
        println("Можно создать нечетное число")
    } else {
        println("Создать нечетное число невозможно")
    }
}