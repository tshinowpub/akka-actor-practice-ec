package com.tshinow.akka.actor.domain.models.cart

import com.tshinow.akka.actor.domain.models.EntityId

case class CartId(private val value: String) extends EntityId {
  override def toString: String = value
}
