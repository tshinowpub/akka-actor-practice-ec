package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ ActorSystem, Behavior }

object Main extends App {

  final case class BasketStart(name: String)

  def apply(): Behavior[BasketStart] = Behaviors.setup { context =>
    val shopper = context.spawn(Shopper(), "shopper")

    shopper ! Shopper.GetSession()

    context.log.info("Start Akka Actor Main.")

    Behaviors.same
  }

  ActorSystem(Main(), "Akka-EC-Cart")
}
