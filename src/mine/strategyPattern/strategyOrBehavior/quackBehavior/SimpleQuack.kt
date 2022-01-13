package mine.strategyPattern.strategyOrBehavior.quackBehavior

import mine.strategyPattern.strategyOrBehavior.quackBehavior.QuackBehavior

class SimpleQuack: QuackBehavior {
    override fun quack() {
        println("Simple Quacking")
    }
}