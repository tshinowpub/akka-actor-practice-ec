package com.tshinow.akka.actor.shop.interface.userInterfase.aggregate.cart

object CartAggregateProtocol {

  sealed trait Command

  sealed trait Reply

  final case class AddCart(
      cartItem: String
  ) extends Command

  sealed trait AddItemReply extends Reply

  case object AddItemSucceeded extends AddItemReply
  case object ItemNotFound     extends AddItemReply
  case object OutOfStock       extends AddItemReply
}
