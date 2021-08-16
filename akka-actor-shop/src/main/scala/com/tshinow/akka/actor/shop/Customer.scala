package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.Behavior

object Customer {
  sealed trait CustomerCommand
  final case class GetSession() extends CustomerCommand

  def apply(): Behavior[CustomerCommand] = Behaviors.receive { (context, message) =>
    context.log.info("Customer !: {}", message)

    Behaviors.same
  }
}
