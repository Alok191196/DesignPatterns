package mine.observerPattern

class TvObserver(val station: WeatherStation): Observer {

    override fun update() {
        println(this.javaClass.name + " temperature is ${station.weather.temperature}")
        println(this.javaClass.name + " humidity is ${station.weather.humidity}")
        println(this.javaClass.name + " pressure is ${station.weather.pressure}")
        println()
    }

}