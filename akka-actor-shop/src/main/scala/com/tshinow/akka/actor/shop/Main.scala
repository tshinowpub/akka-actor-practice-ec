package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ ActorSystem, Behavior }

object Main extends App {
  def apply(): Behavior[Cart.Cart] = Behaviors.setup { context =>
    val customer = context.spawn(Customer(), "customer")

    customer.!(Customer.GetSession())

    context.log.info("Start Main.")

    Behaviors.same
  }

  ActorSystem(Main(), "Akka-EC-Cart")
}
