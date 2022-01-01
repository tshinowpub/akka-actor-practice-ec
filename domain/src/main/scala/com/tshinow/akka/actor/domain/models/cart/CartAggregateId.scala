package com.tshinow.akka.actor.domain.models.cart

import com.tshinow.akka.actor.domain.models.AggregateId

final case class CartAggregateId(private val value: String) extends AggregateId {}

object CartAggregateId {
  def apply(id: CartId): CartAggregateId = new CartAggregateId(id.toString)
}
