package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ ActorSystem, Behavior }

object Main extends App {

  def apply(): Behavior[Cart.Cart] = Behaviors.setup { context =>
    val shopper = context.spawn(Shopper(), "shopper")

    shopper ! Shopper.GetSession()

    context.log.info("Start Akka Actor Main.")

    Behaviors.same
  }

  ActorSystem(Main(), "Akka-EC-Cart")
}
