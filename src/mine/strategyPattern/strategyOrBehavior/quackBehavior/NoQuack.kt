package mine.strategyPattern.strategyOrBehavior.quackBehavior

class NoQuack: QuackBehavior {

    override fun quack() {
        println("No Quacking")
    }
}