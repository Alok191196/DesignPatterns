package mine.observerPattern

fun main() {
    val weather = Weather(12F, 20F, 39F)
    val weatherStation =  WeatherStation(weather)

    val phoneObserver = PhoneObserver(weatherStation)
    val tvObserver = TvObserver(weatherStation)

    weatherStation.register(phoneObserver)
    weatherStation.register(tvObserver)

    weatherStation.notifyObservers()

    weatherStation.unregister(phoneObserver)

    weather.pressure = 40000F
    weatherStation.notifyObservers()
}