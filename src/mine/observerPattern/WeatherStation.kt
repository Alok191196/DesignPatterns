package mine.observerPattern

class WeatherStation(var weather: Weather) : Observable{

    var observers = mutableListOf<Observer>()

    override fun register(observer: Observer) {
        if(!observers.contains(observer)) observers.add(observer)
    }

    override fun unregister(observer: Observer) {
        if (observers.contains(observer)) observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach { it.update() }
    }

}

data class Weather(
    val temperature: Float,
    var pressure: Float,
    val humidity: Float
)