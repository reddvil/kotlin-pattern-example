interface AbstractFactory {
    fun create(type: String);
}

class FactoryProvider: AbstractFactory {
    override fun create(type: String) {
        when(type) {
            "Car" -> CarFactory()
            "AirCraft" -> AircraftFactory();
            else -> null;
        }
    }
}