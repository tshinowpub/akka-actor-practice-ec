package com.tshinow.akka.actor.shop

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.Behavior

object Basket {

  sealed trait BasketCommand extends Shopper.ShopperCommand

  case class AddItem()    extends BasketCommand
  case class RemoveItem() extends BasketCommand
  case class UpdateItem() extends BasketCommand

  def apply(): Behavior[BasketCommand] = {
    basket()
  }

  private def basket(): Behavior[BasketCommand] = Behaviors.receive { (context, message) =>
    message match {
      case AddItem() =>
        context.log.info("Basket AddItem {}!", message)

      case RemoveItem() =>
        context.log.info("Basket RemoveItem {}!", message)

      case UpdateItem() =>
        context.log.info("Basket UpdateItem {}!", message)
    }

    context.log.info("Basket {}!", message)

    Behaviors.same
  }
}
