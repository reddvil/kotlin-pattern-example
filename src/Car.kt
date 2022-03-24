interface Car {
    fun drive();
}

class Audi : Car {
    override fun drive() {
        println("Drive Audi!")
    }
}

class Maserati : Car {
    override fun drive() {
        println("Drive Maserati!")
    }
}

class CarFactory {
    fun create(type: String): Car? {
        return when (type) {
            "Audi" -> Audi()
            "Maserati" -> Maserati()
            else -> null
        }
    }
}
