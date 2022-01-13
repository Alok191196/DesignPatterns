package mine.observerPattern

interface Observable {
    fun register (observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObservers()
}