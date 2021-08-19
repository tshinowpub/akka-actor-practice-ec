package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.Behavior

object Shopper {

  trait ShopperCommand

  final case class GetSession() extends ShopperCommand

  def apply(): Behavior[ShopperCommand] = Behaviors.receive { (context, message) =>
    context.log.info("Shopper apply !: {}", message)

    Behaviors.same
  }
}
