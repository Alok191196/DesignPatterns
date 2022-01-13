package mine.strategyPattern

import mine.strategyPattern.strategyOrBehavior.flyBehavior.FlyBehavior
import mine.strategyPattern.strategyOrBehavior.quackBehavior.QuackBehavior

class Duck(private var flyBehavior: FlyBehavior, private var quackBehavior: QuackBehavior) {

    fun fly() {
        flyBehavior.fly()
    }

    fun quack() {
        quackBehavior.quack()
    }

}