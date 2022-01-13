package mine.strategyPattern

import mine.strategyPattern.strategyOrBehavior.flyBehavior.NoFlying
import mine.strategyPattern.strategyOrBehavior.flyBehavior.SimpleFlying
import mine.strategyPattern.strategyOrBehavior.quackBehavior.ArtificialQuack
import mine.strategyPattern.strategyOrBehavior.quackBehavior.SimpleQuack

fun main() {
    //wild duck -> can fly, can quack

    val wildDuckFlyBehavior = SimpleFlying()
    val wildDuckQuackBehavior = SimpleQuack()
    val wildDuck = Duck(wildDuckFlyBehavior, wildDuckQuackBehavior)
    wildDuck.apply {
        fly()
        quack()
    }


    // Rubber Duck -> can't fly, can quack
    val rubberDuckFlyBehavior = NoFlying()
    val rubberDuckQuackBehavior = ArtificialQuack()
    val rubberDuck = Duck(rubberDuckFlyBehavior, rubberDuckQuackBehavior)
    rubberDuck.apply {
        fly()
        quack()
    }
}