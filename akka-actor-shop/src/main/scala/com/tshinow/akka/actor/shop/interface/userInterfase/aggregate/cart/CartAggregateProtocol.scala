package com.tshinow.akka.actor.shop.interface.userInterfase.aggregate.cart

object CartAggregateProtocol {

  sealed trait Command

  sealed trait Reply

  final case class AddCart(
      cartItem: String
  ) extends Command

  sealed trait AddCartReply extends Reply

  case object AddCartSucceeded extends AddCartReply
}
