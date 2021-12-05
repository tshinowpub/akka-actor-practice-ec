package com.tshinow.akka.actor.shop

import akka.actor.typed.{ ActorSystem, Behavior }
import akka.actor.typed.scaladsl.Behaviors

object AggregateMain extends App {

  final case class BasketStart(name: String)

  def apply(): Behavior[BasketStart] = Behaviors.setup { context =>
    context.log.info("start akka-ec-cart.")

    Behaviors.same
  }

  private val mainBehavior: Behavior[BasketStart] = AggregateMain()

  ActorSystem(mainBehavior, "akka-ec-cart")
}
