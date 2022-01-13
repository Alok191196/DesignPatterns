package mine.strategyPattern.strategyOrBehavior.flyBehavior

import mine.strategyPattern.strategyOrBehavior.flyBehavior.FlyBehavior

class SimpleFlying: FlyBehavior {

    override fun fly() {
        println("Simple Flying Behavior")
    }
}