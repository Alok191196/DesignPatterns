package mine.strategyPattern.strategyOrBehavior.quackBehavior

import mine.strategyPattern.strategyOrBehavior.quackBehavior.QuackBehavior

class ArtificialQuack: QuackBehavior {

    override fun quack() {
        println("Artificial Quack")
    }
}