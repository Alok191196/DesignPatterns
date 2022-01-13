package mine.strategyPattern.strategyOrBehavior.flyBehavior

import mine.strategyPattern.strategyOrBehavior.flyBehavior.FlyBehavior

class NoFlying: FlyBehavior {

    override fun fly() {
        println("No Fly Behavior")
    }
}